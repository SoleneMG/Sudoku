package com.example.mysudoku

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class GameView : View {
    private var gridSeparatorSize : Float = 0F
    private var gridWidth : Float = 0F // Taille de la grille
    private var cellWidth : Float = 0F // Taille d'une cellule
    private var paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG) // paint
    private var paintStroke : Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){}
    constructor(context: Context?) : super(context){}

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        gridSeparatorSize = (w /9) / 20F
        gridWidth = w.toFloat()
        cellWidth = gridWidth / 9F
    }


    var w : Float = width/9F

    override fun onDraw(canvas: Canvas) {
        //pinceau pour le centre
        paint.color = Color.GRAY
        paint.strokeWidth = 2F
        //pinceau pour les bords
        paintStroke.color = Color.BLACK
        paintStroke.strokeWidth = 5F

        for (i in 0..9){
            var paintToUse : Paint = if(i%3 == 0) paintStroke else paint // séléctionne le type de pinceau (gras ou fin)
            canvas.drawLine(0F, cellWidth*i, gridWidth, cellWidth*i, paintToUse) // lignes verticales
            canvas.drawLine( cellWidth*i, 0F,  cellWidth*i, gridWidth, paintToUse) // lignes horizontales
        }


    }



}