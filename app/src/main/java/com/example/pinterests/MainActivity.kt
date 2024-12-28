package com.example.pinterests

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.pinterests.Home.HomeFragment
import com.example.pinterests.Notification.NotificationFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val BottomNav: BottomNavigationView = findViewById(R.id.btn_nav)
        loadFragment(HomeFragment())

        BottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.hostFragment ->{
                    loadFragment(HomeFragment())
                    true
                }
                R.id.search ->{
                    loadFragment(SearchFragment())
                    true
                }
                R.id.create ->{
                    loadFragment(CreateFragment())
                    true
                }
                R.id.notification ->{
                    loadFragment(NotificationFragment())
                    true
                }
                R.id.saved ->{
                    loadFragment(SaveFragment())
                    true
                }
                else -> {
                    loadFragment(HomeFragment())
                    true
                }

            }
        }
    }
    private fun loadFragment (fragment: Fragment){
        val transaction= supportFragmentManager.beginTransaction()
        transaction.replace(R.id.hostFragment,fragment)
        transaction.commit()
    }
}