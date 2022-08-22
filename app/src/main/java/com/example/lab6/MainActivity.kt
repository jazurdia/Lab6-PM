package com.example.lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var homebtn: Button
    private lateinit var searchbtn: Button
    private lateinit var playlistbtn: Button
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
                //R.id.searchbtn -> setFragment(firstFragment())

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