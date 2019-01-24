package com.mikola1122.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runFizzBuzz()
    }

    private fun runFizzBuzz() {
        for (i in (1..100)) when {
            i % 15 == 0 -> Log.i("FizzBuzzTest", "FizzBuzz")
            i % 3 == 0 -> Log.i("FizzBuzzTest", "Fizz")
            i % 5 == 0 -> Log.i("FizzBuzzTest", "Buzz")
            else -> Log.i("FIZZBUZZTest", "$i")
        }
    }

}
