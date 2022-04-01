package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.calculator.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.min

class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
    }

    fun chooseNum(view: View){
        var chooseBut = view as Button
        var textValue : String = result.text.toString()

        if(newOperator){
            result.text = ""
        }
        newOperator = false

        when(chooseBut.id){

            zero.id -> {textValue += "0"}
            one.id -> {textValue += "1"}
            two.id -> {textValue += "2"}
            three.id -> {textValue += "3"}
            four.id -> {textValue += "4"}
            five.id -> {textValue += "5"}
            six.id -> {textValue += "6"}
            seven.id -> {textValue += "7"}
            eight.id -> {textValue += "8"}
            nine.id -> {textValue += "9"}



        }
        result.text = textValue
    }


    var operator = ""
    var oldNum = ""
    var newOperator = true


    fun Calculation(b : View ){
        var chooseCalculation = b as Button
        when(chooseCalculation.id){
            multiply.id -> {operator="*"}
            divide.id -> {operator="/"}
            plus.id -> {operator="+"}
            minus.id -> {operator="-"}

        }
        oldNum = result.text.toString()
        newOperator=true
    }



    fun Delete(deleting : View){
        result.text = ""
        newOperator = true
    }
}