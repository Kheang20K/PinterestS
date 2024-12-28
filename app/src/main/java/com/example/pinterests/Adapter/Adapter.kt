package com.example.pinterests.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.pinterests.R

class Adapter(val list: List<Int>):RecyclerView.Adapter<Adapter.MyView>() {
    inner class MyView(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.image_staggred)
        val moreOptionImageView: ImageView = itemView.findViewById(R.id.more_option)

    }

    interface OnItemClickListener {
        fun onItemClick(item: Int)
    }
    private var onItemClickListener: OnItemClickListener? = null

    fun setOnItemClickListener(listener: OnItemClickListener) {
        onItemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        return MyView(LayoutInflater.from(parent.context).inflate(R.layout.itme_staggred,parent,false))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {

        holder.imageView.setImageResource(list[position])


        holder.itemView.setOnClickListener {
            onItemClickListener?.onItemClick(list[position])
        }
        holder.moreOptionImageView.setOnClickListener {
            showShareSheet(holder.itemView.context,list[position])
        }

    }
    private fun showShareSheet(context: android.content.Context, item: Int){
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,"Sharing item: $item")
            type = "text/plain"

        }
        val shareIntent = Intent.createChooser(sendIntent,null)
        context.startActivity(shareIntent)
    }

}


