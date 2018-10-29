package com.example.nexus.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.app.Activity
import android.content.Intent
import android.support.v4.app.DialogFragment
import kotlinx.android.synthetic.main.second_frag.*


class SecondFragment:DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.second_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView2.text = arguments?.getString("lol1")
        button2.setOnClickListener {
            val intent = Intent()
            intent.putExtra("lol2", "kek2")
            val fragment = targetFragment
            fragment!!.onActivityResult(607, Activity.RESULT_OK, intent)

            val fragment2 = FirstFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.container, fragment2)
            transaction?.commit()
        }
    }
}