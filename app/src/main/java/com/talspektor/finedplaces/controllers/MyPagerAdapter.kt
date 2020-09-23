package com.talspektor.finedplaces.controllers

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


class MyPagerAdapter(fm: FragmentManager, vararg fragments: Fragment) : FragmentStatePagerAdapter(fm) {

    private var pages = fragments

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }
}