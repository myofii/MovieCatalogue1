package com.yofi.moviecatalogue.ui.main

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yofi.moviecatalogue.data.DataEntity
import com.yofi.moviecatalogue.databinding.FragmentListBinding
import com.yofi.moviecatalogue.databinding.ItemFilmBinding
import com.yofi.moviecatalogue.ui.detail.DetailActivity

class ListAdapter: RecyclerView.Adapter<ListAdapter.LinearViewHolder>() {
    private val list = ArrayList<DataEntity>()
    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: DataEntity)
    }

    fun setListDataFilm(data: ArrayList<DataEntity>){
        list.clear()
        list.addAll(data)
        notifyDataSetChanged()
    }

    inner class LinearViewHolder(val binding: ItemFilmBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: DataEntity){
            binding.root.setOnClickListener{
                onItemClickCallback?.onItemClicked(data)
            }
            binding.apply {
                Glide.with(itemView)
                    .load(data.poster)
                    .into(imgPoster)
                tvName.text = data.name + " ("+data.year+")"
                tvRating.text = data.rating
                tvGenre.text = data.genre

//                card.setOnClickListener{
//                    onItemClickCallback?.onItemClicked(data)
//                }

                itemView.setOnClickListener{
                    val moveIntent = Intent(itemView.context, DetailActivity::class.java)
                    moveIntent.putExtra(DetailActivity.EXTRA_ID, data.id)
                    moveIntent.putExtra(DetailActivity.EXTRA_TYPE, if (data.id == "mov%") "MOVIE" else "TVSHOW")
                    itemView.context.startActivity(moveIntent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinearViewHolder {
        val view = ItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LinearViewHolder((view))
    }

    override fun onBindViewHolder(holder: LinearViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}