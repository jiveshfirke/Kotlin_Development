package com.dedsec.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvone = findViewById<TextView>(R.id.tvOne)

        tvone.setOnClickListener {
            evaluateExpression("1", clear = true)
        }

        val tvtwo = findViewById<TextView>(R.id.tvTwo)
        tvtwo.setOnClickListener {
            evaluateExpression("2", clear = true)
        }

        val tvthree = findViewById<TextView>(R.id.tvThree)
        tvthree.setOnClickListener {
            evaluateExpression("3", clear = true)
        }
        val tvfour = findViewById<TextView>(R.id.tvFour)
        tvfour.setOnClickListener {
            evaluateExpression("4", clear = true)
        }

        val tvfive = findViewById<TextView>(R.id.tvFive)
        tvfive.setOnClickListener {
            evaluateExpression("5", clear = true)
        }

        val tvsix = findViewById<TextView>(R.id.tvSix)
        tvsix.setOnClickListener {
            evaluateExpression("6", clear = true)
        }

        val tvseven = findViewById<TextView>(R.id.tvSeven)
        tvseven.setOnClickListener {
            evaluateExpression("7", clear = true)
        }

        val tveight = findViewById<TextView>(R.id.tvEight)
        tveight.setOnClickListener {
            evaluateExpression("8", clear = true)
        }

        val tvnine = findViewById<TextView>(R.id.tvNine)
        tvnine.setOnClickListener {
            evaluateExpression("9", clear = true)
        }

        val tvzero = findViewById<TextView>(R.id.tvZero)
        tvzero.setOnClickListener {
            evaluateExpression("0", clear = true)
        }

        /*Operators*/

        val tvplus = findViewById<TextView>(R.id.tvPlus)
        tvplus.setOnClickListener {
            evaluateExpression("+", clear = true)
        }

        val tvminus = findViewById<TextView>(R.id.tvMinus)
        tvminus.setOnClickListener {
            evaluateExpression("-", clear = true)
        }

        val tvmul = findViewById<TextView>(R.id.tvMul)
        tvmul.setOnClickListener {
            evaluateExpression("*", clear = true)
        }

        val tvdivide = findViewById<TextView>(R.id.tvDivide)
        tvdivide.setOnClickListener {
            evaluateExpression("/", clear = true)
        }

        val tvdot = findViewById<TextView>(R.id.tvDot)
        tvdot.setOnClickListener {
            evaluateExpression(".", clear = true)
        }

        val tvClear = findViewById<TextView>(R.id.tvClear)
        val tvexpression = findViewById<TextView>(R.id.tvExpression)
        val tvresult = findViewById<TextView>(R.id.tvResult)
        tvClear.setOnClickListener {
            tvexpression.text = ""
            tvresult.text = ""
        }

        val tvequals = findViewById<TextView>(R.id.tvEquals)
        tvequals.setOnClickListener {
            val text = tvexpression.text.toString()
            var expression = ExpressionBuilder(text).build()

            val result = expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                tvresult.text = longResult.toString()
            } else {
                tvresult.text = result.toString()
            }
        }

        val tvback = findViewById<TextView>(R.id.tvBack)
        tvback.setOnClickListener {
            val text = tvexpression.text.toString()
            if(text.isNotEmpty()) {
                val len = tvexpression.length()
                tvexpression.text = text.substring(0,len-1)
            }

            tvresult.text = ""
        }
    }

    /*Function to calculate the expressions using expression builder library*/

    fun evaluateExpression(string: String, clear: Boolean) {
        val tvexpression = findViewById<TextView>(R.id.tvExpression)
        val tvresult = findViewById<TextView>(R.id.tvResult)

        if (clear) {
            tvresult.text = ""
            tvexpression.append(string)
        } else {
            tvexpression.append(tvresult.text)
            tvexpression.append(string)
            tvresult.text = ""
        }
    }

}