package com.example.leapyear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t:TextView = findViewById(R.id.textView)
        val b:Button = findViewById(R.id.button)
        val e:EditText = findViewById(R.id.editText)

        var year:Int = 2000

        leapyear(year,t)

        b.setOnClickListener {
            if(e.getText().toString() != ""){
                year = Integer.parseInt(e.getText().toString())
                leapyear(year,t)
            }else{
                t.setText("error")
            }
        }
    }

    fun leapyear(year:Int , text:TextView){
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            text.setText(Integer.toString(year) +" is leap year")
        } else {
            text.setText(Integer.toString(year) +" is not leap year")
        }
    }
}
