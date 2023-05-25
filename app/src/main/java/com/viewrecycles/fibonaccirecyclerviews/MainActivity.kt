package com.viewrecycles.fibonaccirecyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val fibonacciNumbers = generateFibonacciNumbers()
        val adapter = FibonacciAdapter(fibonacciNumbers)
        recyclerView.adapter = adapter
    }

    fun generateFibonacciNumbers(): List<Long> {
        val fibonacciNumbers = mutableListOf<Long>()

        var a = 0L
        var b = 1L

        for (i in 1..100) {
            fibonacciNumbers.add(a)
            val sum = a + b
            a = b
            b = sum
        }

        return fibonacciNumbers
    }
}