package com.gilbram.myberita.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gilbram.myberita.R
import kotlinx.android.synthetic.main.lay_berita.view.*

class NewsAdapter (val context: Context, val listnews: List<news>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var currentNews: news? = null
        var currentPosition: Int = 0

        fun setData(currmews: news, pos: Int) {
            itemView.tvw_title.text = currmews!!.title
            itemView.tvw_Desc.text = currmews!!.desc
            itemView.img_news.setImageResource(currmews!!.photo)

            this.currentNews
            this.currentPosition
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lay_berita, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listnews.size
    }

    override fun onBindViewHolder(holder: NewsAdapter.MyViewHolder, position: Int) {
        var datanews = listnews[position]
        holder.setData(datanews, position)

        holder.itemView.setOnClickListener(){onItemClickCallback.onItemClick(listnews[position])}
    }

    //even click
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClick(data: news)
    }
}