package com.example.praktikumpbm7.feri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val THE_MESSAGE="com.example.praktikumpbm7.feri.MESSAGE"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val a = findViewById<EditText>(R.id.editTxtUsername)
        val message = a.text.toString()

        val intent = Intent(this, ClassLayout2::class.java).apply {
            putExtra(THE_MESSAGE ,message)

        }
        startActivity(intent)
    }
}
