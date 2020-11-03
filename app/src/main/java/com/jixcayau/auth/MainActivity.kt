package com.jixcayau.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.appbar.AppBarLayout
import com.jixcayau.auth.Base.BaseFragment

class MainActivity : AppCompatActivity(), BaseFragment.OnFragmentInteractionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showActionBar() {
        findViewById<AppBarLayout>(R.id.appbarLayout).visibility = View.VISIBLE
    }

    override fun hideActionBar() {
        findViewById<AppBarLayout>(R.id.appbarLayout).visibility = View.GONE
    }
}