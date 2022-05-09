package com.example.mybio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.done_button).setOnClickListener{
            showNickname(it)
        }
    }
    private fun showNickname(v : View){
        var showText=findViewById<TextView>(R.id.nickname_text);
        var inputText=findViewById<EditText>(R.id.edit_nickname);
        showText.text=inputText.text;
        inputText.visibility= View.GONE;
        v.visibility=View.GONE;
        showText.visibility=View.VISIBLE;

    }
}