package com.talspektor.finedplaces

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.talspektor.finedplaces.fragments.DetailsFragment

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(android.R.id.content, DetailsFragment.newInstance())
    }
}
