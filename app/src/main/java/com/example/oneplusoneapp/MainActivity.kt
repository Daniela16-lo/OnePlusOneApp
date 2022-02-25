package com.example.oneplusoneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput1: EditText = findViewById<EditText>(R.id.Input1)
        val userInput2: EditText = findViewById<EditText>(R.id.Input2)
        val userInput3: EditText = findViewById<EditText>(R.id.Input3)
        val buttonL: Button = findViewById<Button>(R.id.button)
        val buttonA: Button = findViewById<Button>(R.id.button2)
        textView = findViewById<TextView>(R.id.textView)

        textView?.text = ""

        buttonA?.setOnClickListener (object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if(userInput1.text.toString()!="" && userInput2.text.toString()!="" && userInput3.text.toString()!="") {
                    textView?.append(userInput1.text)
                    textView?.append("+")
                    textView?.append(userInput2.text)
                    textView?.append("=")
                    textView?.append(userInput3.text)
                    textView?.append("\n")
                    userInput1.setText("")
                    userInput2.setText("")
                    userInput3.setText("")
                } else{
                    textView?.append("\n")
                    //textView?.text = ""
                    userInput1.setText("")
                    userInput2.setText("")
                    userInput3.setText("")
                }



            }
        })

        buttonL?.setOnClickListener( object : View.OnClickListener{
            override fun onClick(p0: View?) {
                textView?.text=""

            }
        })


    }
}

