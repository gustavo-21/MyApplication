package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class InsertInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_info)

        val sendBtn: LinearLayout = findViewById(R.id.send_company_btn)
        val clientNameEt: TextView = findViewById(R.id.client_name_et)

        var clientName: String = ""

        clientNameEt.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                clientName = clientNameEt.text.toString()
            }
        })

        sendBtn.setOnClickListener {
            Toast.makeText(this, clientName, Toast.LENGTH_LONG).show()
        }
    }
}
