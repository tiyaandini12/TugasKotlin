package com.example.tugaskotlin1tiya

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContract

class LoginActivity : AppCompatActivity(), View.OnClickListener {
private lateinit var etUsername:EditText
private lateinit var  etPassword:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etUsername = findViewById(R.id.edt_username)
        etPassword = findViewById(R.id.edt_password)

        val bundle = intent.extras
        if (bundle != null) {
            etUsername.setText(bundle.getString("username"))
            etPassword.setText(bundle.getString("password"))
        }

        val btnLogin: Button = findViewById(R.id.btn_Login)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id){
                R.id.btn_Login ->{
                    val intent = Intent(this@LoginActivity, MainActivity::class .java)
                    startActivity(intent)
                }
            }
        }
    }
}