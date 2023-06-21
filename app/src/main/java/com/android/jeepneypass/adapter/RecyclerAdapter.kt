package com.android.jeepneypass.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.android.jeepneypass.R

//class RecyclerAdapter(
//    private var items: List<RealmItem>
//    ) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
//        return ViewHolder(view)
//    }
//
//    @SuppressLint("SetTextI18n")
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val item = items[position]
//        holder.name.text = item.name
//        holder.price.text = String.format("Price: %.2f",item.price)
//        holder.quantity.text = String.format("Qty: %d",item.availableQuantity)
//        holder.details.text = String.format("Details: %s",item.details)
//    }
//
//    override fun getItemCount(): Int {
//        return items.size
//    }
//
//    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
//        var name: AppCompatTextView = itemView.findViewById(R.id.tv_item_name)
//        var price: AppCompatTextView = itemView.findViewById(R.id.tv_item_price)
//        var quantity: AppCompatTextView = itemView.findViewById(R.id.tv_item_quantity)
//        var details: AppCompatTextView = itemView.findViewById(R.id.tv_item_detail)
//    }
//}