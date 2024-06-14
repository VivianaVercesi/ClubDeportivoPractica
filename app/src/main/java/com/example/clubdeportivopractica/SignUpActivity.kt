package com.example.clubdeportivopractica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        val button1 = findViewById<Button>(R.id.btnClientSignUp)
        button1.setOnClickListener{
            val intent1 = Intent(this, PaymentActivity::class.java)
            startActivity(intent1)
        }
        val button2 = findViewById<Button>(R.id.btnBackAdM)
        button2.setOnClickListener{
            val intent2 = Intent(this, PaymentActivity::class.java)
            startActivity(intent2)
        }
    }
}