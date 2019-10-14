package com.example.primenumber

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.history.*

class HistoryActivity : AppCompatActivity() {
    private var output = arrayListOf<String>()
    var outputResult = arrayListOf<String>()
    var count:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.history)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        output = intent.getStringArrayListExtra("resultList")

        for( i in output.size-1 downTo 0 ){
            if(count<=9){
                outputResult.add(output[i])
                count++
            }else break
        }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, outputResult)
        resultList.adapter = adapter
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}