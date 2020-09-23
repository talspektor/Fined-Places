package com.talspektor.finedplaces

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.talspektor.finedplaces.R.menu.main_menu
import com.talspektor.finedplaces.fragments.DetailsFragment
import com.talspektor.finedplaces.controllers.MyPagerAdapter
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.view_pager.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagerAdapter = MyPagerAdapter(supportFragmentManager, DetailsFragment.newInstance())
        mViewPager.adapter = pagerAdapter

        // add toolbar
        setSupportActionBar(toolbar);
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(main_menu, menu)
        return true;
    }
}
