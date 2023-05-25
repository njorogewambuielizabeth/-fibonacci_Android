package com.viewrecycles.fibonaccirecyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FibonacciAdapter( val fibonacciNumbers: List<Long>) :
    RecyclerView.Adapter<FibonacciAdapter.FibonacciViewHolder>() {

    class FibonacciViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numberTextView: TextView = itemView.findViewById(R.id.numberTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fibonacci_number, parent, false)
        return FibonacciViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FibonacciViewHolder, position: Int) {
        val number = fibonacciNumbers[position]
        holder.numberTextView.text = number.toString()
    }

    override fun getItemCount(): Int {
        return fibonacciNumbers.size
    }
}
