package com.example.loginapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var username_Input : EditText
    lateinit var password_Input : EditText
    lateinit var login_Button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username_Input = findViewById(R.id.username_input)
        password_Input = findViewById(R.id.password_input)
        login_Button = findViewById(R.id.login_btn)

        login_Button.setOnClickListener{
            val username = username_Input.text.toString()
            val password = password_Input.text.toString()
            Log.i("test Credentials", "Username : $username and Password: $password")
        }
    }
}