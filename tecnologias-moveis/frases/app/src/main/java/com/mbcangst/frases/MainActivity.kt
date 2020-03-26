package com.mbcangst.frases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonFrase.setOnClickListener(View.OnClickListener {
            clickButton(buttonFrase)
        })
    }

    fun clickButton(view : View) {
        var phrases = resources.getTextArray(R.array.phrases)
        var number = Random.nextInt(0, phrases.size - 1)
        Log.i("Button","The Button $number" )
        Log.i("Button","The phrase is {$phrases[number]}" )
        textView.text = phrases[number]
    }
}
