package com.example.mysudoku

import kotlin.random.Random


    val rows = 9
    val cols = 9
    var board =
        Array(rows) { IntArray(cols) { 0 } } // tableau à 2 dimensions : toutes les valeurs sont initialisées à 0
    val values = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    fun main() {
        board = generateGrid()
        for (x in 0..board.size - 1) {
            var rowsArray = IntArray(9)
            for (y in 0..rowsArray.size - 1) {
                println(Random.nextInt(1, 9))
            }
        }
    }
    fun generateGrid(): Array<IntArray> {
        for (x in 0..board.size - 1) {
            var rowsArray = IntArray(9)
            for (y in 0..rowsArray.size - 1) {
                rowsArray[y] = Random.nextInt(1, 9)
            }
        }
        return board
    }