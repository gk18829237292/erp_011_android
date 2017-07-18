package com.gk.erp.ui.font

import android.content.Context
import android.graphics.Typeface
import android.widget.TextView
import java.util.jar.Attributes

/**
 * Created by ke.gao on 2017/7/18.
 */
class FontelloTextView(context: Context): TextView(context) {
    var sFontello:Typeface? = null
    init{
        setTypeface()
    }

    constructor(context: Context,attributes: Attributes):this(context){
        setTypeface();
    }

    constructor(context: Context,attributes: Attributes,defStyle:Int):this(context){
        setTypeface()
    }

    fun setTypeface(){
        if(!isInEditMode){
            if(sFontello == null){
                sFontello = Typeface.createFromAsset(context.assets,"fonts/Fontello.ttf")
            }
            setTypeface(sFontello)
        }
    }
}