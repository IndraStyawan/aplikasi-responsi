package com.come.getkonser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var btn_login: Button
    private lateinit var lppw: TextView
    private lateinit var daftar: TextView

    private lateinit var nav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login = findViewById(R.id.btnlogin)
        lppw = findViewById(R.id.lppw)
        daftar = findViewById(R.id.daftar)

        lppw.setOnClickListener{
            val recovery = Intent(this@MainActivity, RecoveryActivity::class.java)
            startActivity(recovery)
        }
        daftar.setOnClickListener {
            val register = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(register)
        }


        btn_login.setOnClickListener {
            val login = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(login)
        }


    }


}