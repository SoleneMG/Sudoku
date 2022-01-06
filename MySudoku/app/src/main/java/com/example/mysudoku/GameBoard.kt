package com.example.mysudoku

import java.util.*
import kotlin.random.Random

class GameBoard {
    private val rows = 9
    private val cols = 9
    private var board = Array(rows) { IntArray(cols) } // tableau à 2 dimensions
    private val values = arrayOf(1,2,3,4,5,6,7,8,9)

    fun generateGrid(){
        for(rows in board){
            for(cols in rows){
                rows.indices = { Random.nextInt(1,9) }
            }
        }
    }

}