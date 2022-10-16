package com.example.mobile_lab_5

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView)
        val editText: EditText = findViewById(R.id.editText)
        val radioButton: RadioButton = findViewById(R.id.radioButton)
        val radioButton2: RadioButton = findViewById(R.id.radioButton2)
        val radioButton3: RadioButton = findViewById(R.id.radioButton3)

        button.setOnClickListener{
            val countLiters =  editText.text.toString().toInt()
            if (radioButton.isChecked)
            {
                val price = countLiters * 92
                textView.text = price.toString()
            }
            if (radioButton2.isChecked)
            {
                val price = countLiters * 95
                textView.text = price.toString()
            }
            if (radioButton3.isChecked)
            {
                val price = countLiters * 98
                textView.text = price.toString()
            }
        }
    }
}
