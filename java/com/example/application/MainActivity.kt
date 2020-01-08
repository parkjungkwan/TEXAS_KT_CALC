package com.example.application

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Calc {
            var num = 0
        }

        val calc = Calc()
        plus.setOnClickListener{
            val number = etext.text.toString()
            calc.num = Integer.parseInt(number)
            etext.setText("")

            Toast.makeText(this,
                "입력된 숫자 " + calc.num+"",Toast.LENGTH_LONG).show()

        }
        equal.setOnClickListener{
            var num1 = calc.num
            var num2 = Integer.parseInt(etext.text.toString())
            etext.setText((num1 + num2).toString())
        }
    }
}
