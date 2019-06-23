package com.example.admin.databindingkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etUsername = findViewById<TextInputEditText>(R.id.name)
        val etPassword = findViewById<TextInputEditText>(R.id.pwd)

        val submit = findViewById<Button>(R.id.btnSignin)
        if (submit != null && etPassword != null && etUsername != null) {
            submit.setOnClickListener {
                val username = etUsername.text.toString()
                val password = etPassword.text.toString()

                Toast.makeText(applicationContext,
                    "Username: $username, Password: $password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
