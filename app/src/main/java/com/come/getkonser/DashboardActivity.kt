package com.come.getkonser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {
    private lateinit var home: BottomNavigationView
    private lateinit var explore: BottomNavigationView
    private lateinit var myticket: BottomNavigationView
    private lateinit var akun: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        home = findViewById(R.id.home_nav)
        explore = findViewById(R.id.explore_nav)
        myticket = findViewById(R.id.myticket_nav)
        akun = findViewById(R.id.akun_nav)

        home.setOnClickListener{
            loadFragment(HomeFragment())
        }
        explore.setOnClickListener{
            loadFragment(ExploreFragment())
        }
        myticket.setOnClickListener{
            loadFragment(myticketFragment())
        }
        akun.setOnClickListener{
            loadFragment(AkunFragment())
        }
    }

    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fl_container,fragment).commitNow()
    }
}
