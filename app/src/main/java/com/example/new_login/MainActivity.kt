package com.example.new_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user: String="ashwani"
        val paswrd: String="akp"


        val edt1=findViewById(R.id.editText_user) as EditText
        val edt2=findViewById(R.id.editText_password) as EditText
        val btn=findViewById(R.id.button) as Button
        val txv_reg=findViewById(R.id.register) as TextView
        Log.i("MAIN","1")

        txv_reg.setOnClickListener{
            //show another page
            val intent_1 = Intent(this, register::class.java)
            startActivity(intent_1)
        }

        btn.setOnClickListener {
            var username:String=edt1.text.toString()
            Log.i("MAIN","2")
            var password:String=edt2.text.toString()
            Log.i("MAIN","3")

            Log.i("MAIN","4")
            if((username == user) && (password == paswrd))
            {
                Log.i("MAIN","5")
                Log.i("MAIN","$username")
                println(username)
                Log.i("MAIN","6")
                println(password)
                Log.i("MAIN","7")
                Toast.makeText(this,"Login successfull",Toast.LENGTH_SHORT).show()
                Log.i("MAIN","8")

                val intent = Intent(this, dashboard::class.java)
                intent.putExtra("user", username)
                intent.putExtra("pass", password)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Login failed  ",Toast.LENGTH_SHORT).show()
            }
        }

    }
}