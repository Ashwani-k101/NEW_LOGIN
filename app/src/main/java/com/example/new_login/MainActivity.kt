package com.example.new_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt1=findViewById(R.id.editText_user) as EditText
        val edt2=findViewById(R.id.editText_password) as EditText
        val btn=findViewById(R.id.button) as Button
        Log.i("MAIN","1")
        var username:String=edt1.text.toString()
        Log.i("MAIN","2")
        var password:String=edt2.text.toString()
        Log.i("MAIN","3")
        btn.setOnClickListener {

            Log.i("MAIN","4")
            if((username != "ashwani") && (password != "akp"))
            {
                Log.i("MAIN","5")
                Log.i("MAIN","$username")
                println(username)
                Log.i("MAIN","6")
                println(password)
                Log.i("MAIN","7")
                Toast.makeText(this,"Login successfull",Toast.LENGTH_SHORT).show()
                Log.i("MAIN","8")
            }
            else{
                Toast.makeText(this,"Login failed  ",Toast.LENGTH_SHORT).show()
            }
        }

    }
}