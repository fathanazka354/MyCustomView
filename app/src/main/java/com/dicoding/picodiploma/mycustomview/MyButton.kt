package com.dicoding.picodiploma.mycustomview

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class MyButton : AppCompatButton {
    constructor(context: Context): super(context){

    }
    constructor(context: Context, attr: AttributeSet): super(context, attr){

    }
    constructor(context: Context, attr: AttributeSet, defStyleAttr: Int): super(context, attr, defStyleAttr){

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }
}