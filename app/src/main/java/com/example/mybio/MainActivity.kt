package com.example.mybio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.mybio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
          binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
//        findViewById<Button>(R.id.done_button).setOnClickListener{
//            showNickname(it)
//        }
        binding.doneButton.setOnClickListener{
            showNickname(it)
        }
    }
    private fun showNickname(v : View){
        binding.apply{
            nicknameText.text=binding.editNickname.text
            editNickname.visibility=View.GONE;
            doneButton.visibility=View.GONE;
            nicknameText.visibility=View.VISIBLE;
        }

    }
}