package com.example.nbaplayers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.nbaplayers.databinding.ActivityMainBinding
import com.example.nbaplayers.fragments.AboutFragment
import com.example.nbaplayers.fragments.PlayersFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bottomNavigation()
    }

    //Bottom Navigation
    private fun bottomNavigation() {
        val playersFragment = PlayersFragment()
        val aboutFragment = AboutFragment()

        setCurrentFragment(playersFragment)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.playersFragment -> setCurrentFragment(playersFragment)
                R.id.aboutFragment -> setCurrentFragment(aboutFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_fragment, fragment)
            commit()
        }
    }
}