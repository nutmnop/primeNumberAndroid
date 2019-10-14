package com.example.primenumber

import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.Sampler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.drawable.Drawable
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun checkPrimeNum(number:Int): Boolean {

        var isPrime = true
        for (i in 2..number/2 ){
            if(number % i ==0){
                isPrime = false
            }
        }
        return isPrime
    }

    fun checkPrime(view: View) =
        if(inputNum.text.isEmpty()){
            result.text = "Result"
            result.setTextColor(Color.BLACK)
            result.background.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_OVER)
        }
        else if (checkPrimeNum(Integer.parseInt(inputNum.text.toString()))){
            result.text = "Prime"
            result.setTextColor(Color.WHITE)
            result.background.setColorFilter(Color.RED, PorterDuff.Mode.SRC_OVER)
        }else{
            result.text = "Not Prime"
            result.setTextColor(Color.WHITE)
            result.background.setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_OVER)
        }
    }
