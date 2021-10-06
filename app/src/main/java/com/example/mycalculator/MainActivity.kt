package com.example.mycalculator
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import io.kaen.dagger.ExpressionParser
import kotlin.Exception
import android.os.Build
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity()
{
    private var memVal:String = ""
    private var tempVal:String = ""
    private var demo:Boolean = false
    private var stapleNum:Int = 0
    private lateinit var  previousCalculation:android.widget.TextView
    private lateinit var  display:android.widget.EditText
    private var maxFigureNum:Int = 0
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        previousCalculation = findViewById(R.id.previousCalculationView)
        display = findViewById(R.id.displayEditText)

        display.showSoftInputOnFocus = false

    }



    private fun UpdateText(strToAdd:String)
    {
        var oldStr: String = display.text.toString()

        var cursorPos:Int = display.selectionStart
        var leftStr:String = oldStr.substring(0, cursorPos)
        var rightStr:String = oldStr.substring(cursorPos)

        display.setText(String.format("%s%s%s",leftStr,strToAdd, rightStr))
        display.setSelection(cursorPos + strToAdd.length)
    }
    //gachi 2642 sqrt 221a
    fun zeroBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch== ")" || ch == "!" || (ch == "I" || ch =="e"))
                UpdateText("+" +resources.getString( R.string.Zero))
            else
                UpdateText(resources.getString(R.string.Zero))
        }catch (e:Exception){
        }
    }
    fun oneBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch== ")" || ch == "!" || (ch == "I" || ch =="e"))
                UpdateText("+" +resources.getString( R.string.One))
            else
                UpdateText(resources.getString(R.string.One))
        }catch (e:Exception){
        }
    }
    fun twoBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch== ")" || ch == "!" || (ch == "I" || ch =="e"))
                UpdateText("+" +resources.getString( R.string.Two))
            else
                UpdateText(resources.getString(R.string.Two))
        }catch (e:Exception){
        }
    }
    fun threeBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch== ")" || ch == "!" || (ch == "I" || ch =="e"))
                UpdateText("+" +resources.getString( R.string.Three))
            else
                UpdateText(resources.getString(R.string.Three))
        }catch (e:Exception){
        }
    }
    fun fourBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch== ")" || ch == "!" || (ch == "I" || ch =="e"))
                UpdateText("+" +resources.getString( R.string.Four))
            else
                UpdateText(resources.getString(R.string.Four))
        }catch (e:Exception){
        }
    }
    fun fiveBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch== ")" || ch == "!" || (ch == "I" || ch =="e"))
                UpdateText("+" +resources.getString( R.string.Five))
            else
                UpdateText(resources.getString(R.string.Five))
        }catch (e:Exception){
        }
    }
    fun sixBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch== ")" || ch == "!" || (ch == "I" || ch =="e"))
                UpdateText("+" +resources.getString( R.string.Six))
            else
                UpdateText(resources.getString(R.string.Six))
        }catch (e:Exception){
        }
    }
    fun sevenBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch== ")" || ch == "!" || (ch == "I" || ch =="e"))
                UpdateText("+" +resources.getString( R.string.Seven))
            else
                UpdateText(resources.getString(R.string.Seven))
        }catch (e:Exception){
        }
    }
    fun eightBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch== ")" || ch == "!" || (ch == "I" || ch =="e"))
                UpdateText("+" +resources.getString( R.string.Eight))
            else
                UpdateText(resources.getString(R.string.Eight))
        }catch (e:Exception){
        }
    }
    fun nineBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch== ")" || ch == "!" || (ch == "I" || ch =="e"))
                UpdateText("+" +resources.getString( R.string.Nine))
            else
                UpdateText(resources.getString(R.string.Nine))
    }catch (e:Exception){
    }
    }
    fun pointBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch.toInt()  in 0..9)
                UpdateText(resources.getString(R.string.Point))
        }catch (e:Exception){
        }
    }
    fun plusBtnPush(view:android.view.View)
    {
        try {
            var ch:String = lastChar()
            when(ch) {
                "%" ,
                resources.getString(R.string.Divide) ,
                resources.getString(R.string.Multiply),
                "-" -> {
                    var textLen:Int = display.text.length

                    if (textLen != 0)
                    {
                        var selection:SpannableStringBuilder = display.text as SpannableStringBuilder
                        selection.replace(textLen - 1, textLen - 0, "+")
                        display.text = selection
                        display.setSelection(textLen )
                    }
                }
                else -> {
                    if (ch == ")" || ch == "!" || (ch == "I" || ch =="e") || ch.toInt()  in 0..9)
                        UpdateText(resources.getString(R.string.Plus))
                }
            }

        }catch (e:Exception){
        }
    }
    fun minusBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch == ")" || ch == "!" || (ch == "I" || ch =="e") || ch.toInt()  in 0..9 )
                UpdateText(resources.getString(R.string.Minus))
        }catch (e:Exception){
        }
    }
    fun divBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()

            if (ch == ")" || ch == "!" || (ch == "I" || ch =="e") || ch.toInt()  in 0..9)
                UpdateText(resources.getString(R.string.Divide))
        }catch (e:Exception){
        }
    }
    fun mulBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if (ch == ")" || ch == "!" || (ch == "I" || ch =="e") || ch.toInt()  in 0..9 )
                UpdateText(resources.getString(R.string.Multiply))
        }catch (e:Exception){
        }
    }
    fun percentBtnPush(view:android.view.View)
    {
        try {
            if(!demo)
            {
                val ch:String = lastChar()
                if (ch == ")" || ch == "!" || (ch == "I" || ch =="e") || ch.toInt()  in 0..9 )
                    UpdateText(resources.getString(R.string.Percent))
            }

        }catch (e:Exception){
        }
    }
    fun staplesBtnPush(view:android.view.View)
    {
        try {
            val ch:String = lastChar()
            if(ch == "." || ch == "!")
                return
            else if (ch == "777"){
                UpdateText(resources.getString(R.string.Left_Staple))
                stapleNum -= 1
                return
            }
            if (ch == ")" || (ch == "I" || ch =="e") || ch.toInt()  in 0..9)
            {
                if (stapleNum < 0){
                    UpdateText(resources.getString(R.string.Right_Staple))
                    stapleNum += 1
                } else{
                    UpdateText("+" + resources.getString(R.string.Left_Staple))
                    stapleNum -= 1
                }
            }
            else{
                UpdateText("+" + resources.getString(R.string.Left_Staple))
                stapleNum -= 1
                }
               //UpdateText(resources.getString(R.string.Percent))
        }catch (e:Exception){
            UpdateText( resources.getString(R.string.Left_Staple))
            stapleNum -= 1
        }

    }
    fun clearBtnPush(view:android.view.View)
    {
        display.setText("")
        previousCalculation.text = ""
    }
    fun memReadBtnPush(view:android.view.View)
    {
        if(!demo)
        {
            if (memVal != ""){
                val ch:String = lastChar()
                if (ch == ".")
                    return
                if (ch == ")" || ch == "(" || ch == "!" || (ch == "I" || ch =="e" || ch == "777")
                    || ch.toInt()  in 0..9 ){
                    previousCalculation.text = "(M) " + previousCalculation.text
                    UpdateText("+$memVal")
                }
            }
        }
    }
    fun memClearBtnPush(view:android.view.View)
    {
        if(!demo)
        {
            previousCalculation.text = "(M) " + previousCalculation.text
            memVal = ""
        }
    }
    fun memPlusBtnPush(view:android.view.View)
    {
        if(!demo && tempVal != "NaN")
        {
            previousCalculation.text = "(M)"
            memVal = if (memVal != "")
                (memVal.toDouble() + tempVal.toDouble()).toString()
            else
                tempVal
        }
    }
    fun memMinusBtnPush(view:android.view.View)
    {
        if(!demo && tempVal != "NaN")
        {
            previousCalculation.text = "(M)"
            memVal = if (memVal != "")
                (memVal.toDouble() - tempVal.toDouble()).toString()
            else
                (tempVal.toDouble() * (-1)).toString()
        }
    }
    fun backSpaceBtnPush(view:android.view.View)
    {
        var cursorPos:Int = display.selectionStart
        var textLen:Int = display.text.length

        if (cursorPos != 0 && textLen != 0)
        {
            var last:String = lastChar()


            var selection:SpannableStringBuilder = display.text as SpannableStringBuilder
            selection.replace(cursorPos - 1, cursorPos, "")
            display.text = selection
            display.setSelection(cursorPos - 1)
        }
    }
    fun horizontalLayoutBtnPush(view:android.view.View)
    {
        //resources.configuration.orientation = android.content.res.Configuration.ORIENTATION_LANDSCAPE
        requestedOrientation = if(resources.configuration.orientation != android.content.res.Configuration.ORIENTATION_LANDSCAPE)
            android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        else
            android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
    fun equalBtnPush(view:android.view.View)
    {
        try {
            var userExp:String = display.text.toString()

            previousCalculation.text = userExp

            userExp = userExp.replace(resources.getString(R.string.Divide),"/")
            userExp = userExp.replace(resources.getString(R.string.Multiply),"*")

            val parser = ExpressionParser()

            val result:String = parser.evaluate(userExp).toString()
            tempVal = result
            display.setText(result)
            display.setSelection(result.length)
        }catch (e:Exception){
            previousCalculation.text = "Error in expression!"
        }
    }
    fun sinBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == "." || ch == "!")
                    return
                if (ch == ")" || (ch == "I" || ch == "e") || ch.toInt() in 0..9) {
                    stapleNum -= 1
                    UpdateText("+sin(")
                } else {
                    stapleNum -= 1
                    UpdateText("sin(")
                }
            }
        }catch (e:Exception){
            stapleNum -= 1
            UpdateText("sin(")
        }

    }
    fun cosBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == "." || ch == "!")
                    return
                if (ch == ")" || (ch == "I" || ch == "e") || ch.toInt() in 0..9) {
                    stapleNum -= 1
                    UpdateText("+cos(")
                } else {
                    stapleNum -= 1
                    UpdateText("cos(")
                }
            }
        }catch (e:Exception){
            stapleNum -= 1
            UpdateText("cos(")
        }
    }
    fun tanBtnPush(view:android.view.View)
    {
        try {
            if(!demo)
            {
                val ch:String = lastChar()
                if(ch == "." || ch == "!")
                    return
                if (ch == ")" || (ch == "I" || ch =="e") || ch.toInt()  in 0..9){
                    stapleNum -= 1
                    UpdateText("+tan(")
                }
                else {
                    stapleNum -= 1
                    UpdateText("tan(")
                }
            }
        }catch (e:Exception){
            stapleNum -= 1
            UpdateText("tan(")
        }
    }
    fun asinBtnPush(view:android.view.View)
    {
        try {
            if(!demo)
            {
                val ch:String = lastChar()
                if(ch == "." || ch == "!")
                    return
                if (ch == ")" || (ch == "I" || ch =="e") || ch.toInt()  in 0..9){
                    stapleNum -= 1
                    UpdateText("+asin(")
                }
                else {
                    stapleNum -= 1
                    UpdateText("asin(")
                }
            }
        }catch (e:Exception){
            stapleNum -= 1
            UpdateText("asin(")
        }
    }
    fun acosBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == "." || ch == "!")
                    return
                if (ch == ")" || (ch == "I" || ch == "e") || ch.toInt() in 0..9) {
                    stapleNum -= 1
                    UpdateText("+acos(")
                } else {
                    stapleNum -= 1
                    UpdateText("acos(")
                }
            }
        }catch (e:Exception){
            stapleNum -= 1
            UpdateText("acos(")
        }
    }
    fun atanBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == "." || ch == "!")
                    return
                if (ch == ")" || (ch == "I" || ch == "e") || ch.toInt() in 0..9) {
                    stapleNum -= 1
                    UpdateText("+atan(")
                } else {
                    stapleNum -= 1
                    UpdateText("atan(")
                }
            }
        }catch (e:Exception){
            stapleNum -= 1
            UpdateText("atan(")
        }
    }
    fun piBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == ".")
                    return
                if (ch == ")" || ch == "!" || (ch == "I" || ch == "e") || ch.toInt() in 0..9)
                    UpdateText("+PI")
                else
                    UpdateText("PI")
            }
        }catch (e:Exception){
            UpdateText("PI")
        }

    }
    fun eBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == ".")
                    return
                if (ch == ")" || ch == "!" || (ch == "I" || ch == "e") || ch.toInt() in 0..9)
                    UpdateText("+e")
                else
                    UpdateText("e")
            }
        }catch (e:Exception){
            UpdateText("e")
        }
    }
    fun factorialBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == ")" || ch.toInt() in 0..9)
                    UpdateText("!")
            }
        }catch (e:Exception){
        }
    }
    fun sqrtBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == ".")
                    return
                stapleNum -= if (ch == ")" || ch == "!" || (ch == "I" || ch == "e") || ch.toInt() in 0..9) {
                    UpdateText("+sqrt(")
                    1
                } else {
                    UpdateText("sqrt(")
                    1
                }
            }
        }catch (e:Exception){
            UpdateText("sqrt(")
        }
    }
    fun power2BtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == ")" || (ch == "I" || ch == "e") || ch.toInt() in 0..9)
                    UpdateText("^(2)")
            }
        }catch (e:Exception){
        }
    }
    fun power3BtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == ")" || (ch == "I" || ch == "e") || ch.toInt() in 0..9)
                    UpdateText("^(3)")
            }
        }catch (e:Exception){
        }
    }
    fun poweryBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == ")" || (ch == "I" || ch == "e") || ch.toInt() in 0..9) {
                    stapleNum -= 1
                    UpdateText("^(")
                }
            }
        }catch (e:Exception){
        }
    }
    fun logBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == ".")
                    return
                stapleNum -= if (ch == ")" || ch == "!" || (ch == "I" || ch == "e") || ch.toInt() in 0..9) {
                    UpdateText("+log10(")
                    1
                } else {
                    UpdateText("log10(")
                    1
                }
            }
        }catch (e:Exception){
            stapleNum -= 1
            UpdateText("log10(")
        }
    }
    fun natlogBtnPush(view:android.view.View)
    {
        try {
            if(!demo) {
                val ch: String = lastChar()
                if (ch == ".")
                    return
                stapleNum -= if (ch == ")" || ch == "!" || (ch == "I" || ch == "e") || ch.toInt() in 0..9) {
                    UpdateText("+ln(")
                    1
                } else {
                    UpdateText("ln(")
                    1
                }
            }
        }catch (e:Exception){
            stapleNum -= 1
            UpdateText("ln(")
        }
    }
    private fun lastChar():String
    {
        var cursorPos:Int = display.selectionStart
        var textLen:Int = display.text.length
        var selection:String = if (cursorPos != 0 && textLen != 0) {
            display.text.substring(cursorPos - 1, cursorPos)
        } else {
            "777"
        }
        return selection
    }

    private fun checkMultiplePoint()
    {
        //????????????????????
    }
}