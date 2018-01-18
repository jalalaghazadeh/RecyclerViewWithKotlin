package com.mrjalal.recyclerviewwithkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_image.view.*

/**
 * Created by Jalal on 1/18/2018.
 */
class CustomAdapter(private val dataList: ArrayList<ImageInfo>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.onBind(dataList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(currentImage:ImageInfo){
            itemView.tv_caption.text = currentImage.imageCaption
            Glide.with(itemView.context)
                    .load(currentImage.imageUrl)
                    .into(itemView.iv_image)
        }
    }
}