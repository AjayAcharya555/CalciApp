package com.example.calciapp

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import com.example.calciapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity() : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clear.setOnClickListener {
            binding.outputtext.text = ""
            binding.inputtext.text = ""
        }

        binding.btnone.setOnClickListener {
            binding.inputtext.append("1")
        }
        binding.btntwo.setOnClickListener {
            binding.inputtext.append("2")
        }
        binding.btnthree.setOnClickListener {
            binding.inputtext.append("3")
        }
        binding.btnfour.setOnClickListener {
            binding.inputtext.append("4")
        }
        binding.btnfive.setOnClickListener {
            binding.inputtext.append("5")
        }
        binding.btnsix.setOnClickListener {
            binding.inputtext.append("6")
        }
        binding.btnseven.setOnClickListener {
            binding.inputtext.append("7")
        }
        binding.btneight.setOnClickListener {
            binding.inputtext.append("8")
        }
        binding.btnnine.setOnClickListener {
            binding.inputtext.append("9")
        }
        binding.btnzeroo.setOnClickListener {
            binding.inputtext.append("0")
        }

        binding.btnplus.setOnClickListener {
            binding.inputtext.append("+")
        }
        binding.btnsub.setOnClickListener {
            binding.inputtext.append("-")
        }
        binding.btnmulti.setOnClickListener {
            binding.inputtext.append("*")
        }
        binding.btndivide.setOnClickListener {
            binding.inputtext.append("/")
        }
        binding.btndot.setOnClickListener {
            binding.inputtext.append(".")
        }

        binding.btnrcir.setOnClickListener {
            binding.inputtext.append(" ) ")
        }
        binding.btnlcir.setOnClickListener {
            binding.inputtext.append(" ( ")
        }
        binding.btnback.setOnClickListener {
            binding.inputtext.append("")
        }

        binding.btnequal.setOnClickListener {

            val expression = ExpressionBuilder(binding.inputtext.text.toString()).build()
            val result = expression.evaluate()

            val longresult = result.toLong()

            if (result == longresult.toDouble()) {
                binding.outputtext.text = longresult.toString()

            } else {
                binding.outputtext.text = result.toString()
            }
        }
    }
}




