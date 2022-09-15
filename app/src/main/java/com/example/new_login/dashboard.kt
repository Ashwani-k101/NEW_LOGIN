package com.example.new_login

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class dashboard: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val txv_dash=findViewById(R.id.dash_user) as TextView

        txv_dash.append(intent.getStringExtra("user"))
        txv_dash.append("     ")
        txv_dash.append(intent.getStringExtra("pass"))
    }
}