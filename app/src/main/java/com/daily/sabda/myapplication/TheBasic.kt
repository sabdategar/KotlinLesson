package com.daily.sabda.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.Toast


import kotlinx.android.synthetic.main.activity_the_basic.*

class TheBasic : AppCompatActivity() {

    var myInt: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_basic)
    }

    fun intCount(view: View?) {
        myInt = Integer.parseInt(txt_int.text as String?)
        myInt++
        setTheText(myInt)
    }

    fun intRandom(view: View?) {

    }

    fun intToast(view: View?) {
        val myToast = Toast.makeText(this, txt_int.text, Toast.LENGTH_LONG)
        myToast.show()
    }

    fun setTheText(myInt: Int) {
        txt_int.setText(myInt.toString())
    }
}
