package org.silvatech.startup

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    protected fun buClick(view:View){
        val buSelected:Button = view as Button
        var cellID =0
        when(buSelected.id){
            R.id.bu1 -> cellID = 1
            R.id.bu2 -> cellID = 2
            R.id.bu3 -> cellID = 3
            R.id.bu4 -> cellID = 4
            R.id.bu5 -> cellID = 5
            R.id.bu6 -> cellID = 6
            R.id.bu7 -> cellID = 7
            R.id.bu8 -> cellID = 8
            R.id.bu9 -> cellID = 9

        }
        Toast.makeText(this, "ID: $cellID", Toast.LENGTH_LONG).show()
        PlayGame(cellID,buSelected)

    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var ActivePlayer=1


    fun PlayGame(cellId:Int,buSelected:Button){

        if (ActivePlayer==1){
            buSelected.text="X"
            buSelected.setBackgroundColor(Color.GREEN)
            player1.add(cellId)
            ActivePlayer=2
        }
        else{
            buSelected.text="O"
            buSelected.setBackgroundColor(Color.BLUE)
            player2.add(cellId)
            ActivePlayer=1
        }

        buSelected.isEnabled=false
        CheckWinner()

    }
    fun CheckWinner(){
        var winner=-1

        //Row1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winner=1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winner=2
        }
        //Row2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winner=1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winner=2
        }
        //Row2
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winner=1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winner=2
        }


        //Co1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winner=1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winner=2
        }
        //Col2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winner=1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winner=2
        }
        //Col3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner=1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winner=2
        }

        //Xpat1
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)){
            winner=1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)){
            winner=2
        }
        //Xpat2
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)){
            winner=1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)){
            winner=2
        }
        //Xpat3
        if (player1.contains(7) && player1.contains(5) && player1.contains(3)){
            winner=1
        }
        if (player2.contains(7) && player2.contains(5) && player2.contains(3)){
            winner=2
        }
        //Xpat4
        if (player1.contains(9) && player1.contains(5) && player1.contains(1)){
            winner=1
        }
        if (player2.contains(9) && player2.contains(5) && player2.contains(1)){
            winner=2
        }

        if(winner != -1){
            if (winner==1){
                Toast.makeText(this, "The winner of this game is player 1", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "The winner of this game is player 2", Toast.LENGTH_LONG).show()
            }
        }
    }
}
