package com.raqun.hilo.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.raqun.hilo.R
import com.raqun.hilo.data.Card
import com.raqun.hilo.data.Status

/**
 * Created by tyln on 25/05/2017.
 */
class CardsAdapter(val items: List<Card>) : RecyclerView.Adapter<CardsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent?.context).inflate(R.layout.row_card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val card: Card = items[position]
        holder?.bind(card)
    }

    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val back: ImageView = itemView?.findViewById(R.id.back) as ImageView
        val color: ImageView = itemView?.findViewById(R.id.color) as ImageView
        val number: TextView = itemView?.findViewById(R.id.number) as TextView
        val front: ViewGroup = itemView?.findViewById(R.id.front) as ViewGroup

        fun bind(card: Card) {
            number.text = card.num.toString()
            if (card.status == Status.OPENED) {
                back.visibility = View.INVISIBLE
                front.visibility = View.VISIBLE
            } else {
                front.visibility = View.INVISIBLE
                back.visibility = View.VISIBLE
            }
        }
    }

}