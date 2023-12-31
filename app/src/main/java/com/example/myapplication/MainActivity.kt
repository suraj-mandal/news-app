package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.presentation.sign_in.SignInComposableActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button
        btn = findViewById(R.id.btn_splash_screen)
        btn.setOnClickListener{
            startActivity(Intent(this, SignInComposableActivity::class.java))
        }
    }
}