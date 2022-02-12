package com.example.paginador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterViewPager(var item:ArrayList<Screen>):RecyclerView.Adapter<adapterViewPager.contentViews>() {

    class contentViews(vista: View):RecyclerView.ViewHolder(vista) {

        val avatar:ImageView
        val nick:TextView
        val description:TextView
        val btnGo:Button

        init {

            avatar=vista.findViewById(R.id.avatar)
            avatar.setImageResource(R.drawable.android)

            nick=vista.findViewById(R.id.nick)
            description=vista.findViewById(R.id.desc)
            btnGo=vista.findViewById(R.id.btnGo)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contentViews {

        val vista=LayoutInflater.from(parent.context).inflate(R.layout.screen,parent,false)
        return contentViews(vista)

    }

    override fun onBindViewHolder(holder: contentViews, position: Int) {

        val registro=item.get(position)

        holder.nick.text=registro.nick
        holder.description.text=registro.description
        holder.btnGo.text=registro.accion

    }

    override fun getItemCount(): Int = item.size


}

