package com.example.mysudoku

import java.util.*
import kotlin.random.Random

class GameBoard {
    private val rows = 9
    private val cols = 9
    private var board = Array(rows) { IntArray(cols) {0} } // tableau à 2 dimensions : toutes les valeurs sont initialisées à 0
    private val values = arrayOf(1,2,3,4,5,6,7,8,9)

    fun generateGrid(){
        for (x in 0..board.size-1){
            var rowsArray = IntArray(9)
            for(y in 0..rowsArray.size-1){
                rowsArray[y] = Random.nextInt(1,9)
            }
        }
    }


}