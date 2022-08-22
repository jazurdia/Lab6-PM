package com.example.lab6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottomNavigationView)
        setFragment(firstFragment())
        setListener()


    }


    private fun setListener(){
        bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.homebtn -> setFragment(firstFragment())
                R.id.searchbtn -> setFragment(secondFragment())
                R.id.playlistbtn -> setFragment(thirdFragment())

            }
        true
        }
    }



    private fun setFragment(fragment: Fragment){
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragmentContainerView, fragment)

        }
    }




}