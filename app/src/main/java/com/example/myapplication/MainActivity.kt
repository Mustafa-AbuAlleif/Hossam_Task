package com.example.myapplication

import android.content.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var emile: EditText
    lateinit var password: EditText
    lateinit var sign_up: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.login)
       emile = findViewById(R.id.emile)
        password = findViewById(R.id.password)
        sign_up = findViewById(R.id.sign_up)
        login()
        createaccount()
        //println(emile.text.toString())
    }

    private fun createaccount() {
        sign_up.setOnClickListener { val intent = Intent(this,SignUpActivityActivity::class.java)
        startActivity(intent)}
    }


    private fun login() {
        val emiles = emile.text.toString()
           // println(fuck_emils + "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

        /*when (emiles){
            "Admin" , "admin"->{button.setOnClickListener {
                                val intent = Intent(this, MainActivity2::class.java)
                                    startActivity(intent) }}
            else->{button.setOnClickListener {
                Toast.makeText(this, "Login Field", Toast.LENGTH_SHORT).show() }}
        }*/
        if ((emiles.equals("admin")) || (emiles.equals("Admin")) && (password.text.equals("admin")) || (password.text.equals("Admin")))
        {
            button.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent) }
        } else
        {
            button.setOnClickListener {
                Toast.makeText(this, "Login Field", Toast.LENGTH_SHORT).show() }
        }

    }
}