package com.example.nexus.myapplication

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.app.Activity
import android.content.Intent
import android.support.v4.app.Fragment
import android.util.Log
import kotlinx.android.synthetic.main.first_frag.*


class FirstFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.first_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        bundle.putString("lol1", "from forst frag")
        val fragment = SecondFragment()
        fragment.arguments = bundle

//This is required to communicate between two framents. Similar to startActivityForResult
        fragment.setTargetFragment(this@FirstFragment, 607)

        val fragmentManager = fragmentManager
        button.setOnClickListener {
                    val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.container, fragment)
        transaction?.commit() }

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == 607) {
                Log.e("from second frag", intent!!.getStringExtra("lol2"))
            }
        }

    }
}