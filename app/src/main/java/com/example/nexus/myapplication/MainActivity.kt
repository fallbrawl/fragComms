package com.example.nexus.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = FirstFragment()
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

//    fun goToSecond(v: View) {
//
//        val bundle = Bundle()
//        bundle.putString("lol1", "kek1")
//
//        val fragment = SecondFragment()
//        fragment.arguments = bundle
//
//        //This is required to communicate between two framents. Similar to startActivityForResult
//        fragment.setTargetFragment(FirstFragment(), 607)
//
//        val fragmentManager = supportFragmentManager
//
//        //fragment.show(fragmentManager, AppConstant.FRAGMENT_NAME)
//
//        val transaction = fragmentManager.beginTransaction()
//        transaction.replace(R.id.container, fragment)
//        transaction.commit()
//    }
}
