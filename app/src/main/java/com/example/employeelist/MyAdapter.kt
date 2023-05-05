package com.example.employeelist

import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var con: Context, var list : List<UserDetailsItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var viewName= itemView.findViewById<TextView>(R.id.tvName)
        var viewMail = itemView.findViewById<TextView>(R.id.tvMail)
        var fulclick: ConstraintLayout
        init {
            fulclick=itemView.findViewById(R.id.fullclick)
        }



    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view= LayoutInflater.from(con).inflate(R.layout.row_item,parent,false)
        return ViewHolder(view)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.viewName.text=list[position].name
        holder.viewMail.text=list[position].email

        holder.fulclick.setOnClickListener {
        }



    }

    override fun getItemCount(): Int {
        return list.size
    }
}