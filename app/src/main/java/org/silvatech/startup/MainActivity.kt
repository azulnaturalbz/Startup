package org.silvatech.startup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        tvDisplay.text="Welcome to Kotlin"
//        getAge.setOnClickListener{
//            // action will happen when clicke on
//            val calendar = Calendar.getInstance()
//            val year:Int = calendar.get(Calendar.YEAR)
//            var dob:Int  = ageInput.text.toString().toInt()
//            val myAge = year - dob
//            ageDisplay.text = "Your age in years is $myAge"
//        }

    }

    fun getAge(view:View){
        val calendar = Calendar.getInstance()
        val year:Int = calendar.get(Calendar.YEAR)

        if (ageInput.toString().isNullOrBlank() !== true || ageInput.toString().isNullOrEmpty() !== true){
            val dob:Int  = ageInput.text.toString().toInt()
            if (dob > 0) {
                val myAge = year - dob
                ageDisplay.text = "Your age in years is $myAge"
            } else {
                ageDisplay.text = "Kindly enter a number greater than zero please"
                return
            }
        }else {
            ageDisplay.text = "Invalid Input try again"
            return
        }
//        val myAge = year - dob
//        ageDisplay.text = "Your age in years is $myAge"


    }
}
