package com.example.clubdeportivopractica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdminMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_admin_menu)

        val button = findViewById<Button>(R.id.btnSignUp)
        button.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.btnPayment)
        button2.setOnClickListener{
            val intent2 = Intent(this, PaymentActivity::class.java)
            startActivity(intent2)
        }
        val button3 = findViewById<Button>(R.id.btnDueDate)
        button3.setOnClickListener{
            val intent3 = Intent(this, DailyExpirationsActivity::class.java)
            startActivity(intent3)
        }
        val button4 = findViewById<Button>(R.id.btnGetMembership)
        button4.setOnClickListener{
            val intent4 = Intent(this, IdCardActivity::class.java)
            startActivity(intent4)
        }
        val button5 = findViewById<Button>(R.id.btnActSignUp)
        button5.setOnClickListener{
            val intent5 = Intent(this, SignUpActivitiesActivity::class.java)
            startActivity(intent5)
        }
        val button6 = findViewById<Button>(R.id.btnExit)
        button6.setOnClickListener{
            val intent6 = Intent(this, MainActivity::class.java)
            startActivity(intent6)
        }

    }
}