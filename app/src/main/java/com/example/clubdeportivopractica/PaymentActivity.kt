package com.example.clubdeportivopractica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button1 = findViewById<Button>(R.id.btnPay)
        button1.setOnClickListener{
            val intent1 = Intent(this, PaymentReceiptActivity::class.java)
            startActivity(intent1)
        }
        val button2 = findViewById<Button>(R.id.btnBackAM)
        button2.setOnClickListener{
            val intent2 = Intent(this, AdminMenuActivity::class.java)
            startActivity(intent2)
        }

    }
}