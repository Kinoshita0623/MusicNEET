package org.panta.musicneet

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.bottom_nav_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_all_music -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_like_music -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_playlist -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_recently -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
