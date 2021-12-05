package com.example.learning2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("testlogs", "in onCreate")

        // Инициализировали объект кнопки
        // Указали объект кнопки на элемент внутри XML
        val registerButton = findViewById<Button>(R.id.main_activity_register_button)
        // Прикрепили обработчик нажатия к нашей кнопке
        registerButton.setOnClickListener {
            val regActivity = Intent(this@MainActivity, RegisrationActivity::class.java)
            startActivity(regActivity)
            Log.d("testlogs", "CLICK")
        }
    }

    override fun onStop() {
        super.onStop()
        Log.d("testlogs", "in onStop")

    }

}