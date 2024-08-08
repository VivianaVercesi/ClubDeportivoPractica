package com.example.clubdeportivopractica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
       lateinit var databaseHelper: DatabaseHelper

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val usernameEditText = findViewById<EditText>(R.id.txtUser)
        val passwordEditText = findViewById<EditText>(R.id.txtPass)
        val loginButton = findViewById<Button>(R.id.btnLogIn)

        databaseHelper = DatabaseHelper(this)

        val button = findViewById<Button>(R.id.btnLogIn)
        button.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (databaseHelper.validateUser(username, password)) {
                val intent = Intent(this, AdminMenuActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show()
            }
        }

    }
}
