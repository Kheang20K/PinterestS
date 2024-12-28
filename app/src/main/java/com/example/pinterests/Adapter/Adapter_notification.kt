package com.example.pinterests.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.PopupMenu
import androidx.recyclerview.widget.RecyclerView
import com.example.pinterests.Data.DataClass_notification
import com.example.pinterests.R



class Adapter_notification(private val dataList: ArrayList<DataClass_notification>):
    RecyclerView.Adapter<Adapter_notification.ViewHolderClass>() {



    inner class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val rvImage: ImageView = itemView.findViewById(R.id.imagelist_notification)
        val rvTitle: TextView = itemView.findViewById(R.id.Title)
        val rvMore_option: ImageView= itemView.findViewById(R.id.more_option_notification)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.itemlist_notification_fragment,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvImage.setImageResource(currentItem.dataImage1)
        holder.rvTitle.text = currentItem.dataTitle
        /*holder.rvMore_option.setImageResource(currentItem.moreOptionList)*/

    }


}

