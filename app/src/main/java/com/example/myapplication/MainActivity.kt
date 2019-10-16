package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val knowMoreBtn: LinearLayout = findViewById(R.id.know_more_btn)

        knowMoreBtn.setOnClickListener {
            var intent = Intent(this, Inser tInfoActivity::class.java)
            startActivity(intent)
        }

    }
}
