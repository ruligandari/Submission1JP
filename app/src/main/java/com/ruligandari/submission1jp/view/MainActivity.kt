package com.ruligandari.submission1jp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ruligandari.submission1jp.databinding.ActivityMainBinding
import com.ruligandari.submission1jp.view.adapter.SectionPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val sectionsPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        activityMainBinding.viewpager.adapter = sectionsPagerAdapter
        activityMainBinding.tabs.setupWithViewPager(activityMainBinding.viewpager)

        supportActionBar?.elevation = 0f
    }
}