package com.example.whatsapp_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu
import android.widget.Toolbar
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {


    private var tabLayout:TabLayout?=null
    private var viewPager:ViewPager?=null
    var toolbar:Toolbar?=null
    var viewPagerAdapter:ViewPagerAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("check","1")
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        toolbar = findViewById(R.id.myAppbar)
        Log.d("check","2")

        setSupportActionBar(findViewById(R.id.myToolBar))
        Log.d("check","3")
//        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        supportActionBar?.title = "Whatsapp"
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        tabLayout?.setupWithViewPager(viewPager)
        viewPager?.adapter = viewPagerAdapter
        Log.d("check","4")
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

}