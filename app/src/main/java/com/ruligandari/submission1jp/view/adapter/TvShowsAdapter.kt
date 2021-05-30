package com.ruligandari.submission1jp.view.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ruligandari.submission1jp.R
import com.ruligandari.submission1jp.databinding.ItemTvShowsBinding
import com.ruligandari.submission1jp.model.TvEntity
import com.ruligandari.submission1jp.view.detail.DetailTvShowsActivity

class TvShowsAdapter: RecyclerView.Adapter<TvShowsAdapter.TvShowsViewHolder>() {
    private var listshow = ArrayList<TvEntity>()

    fun setTvShows(tvshows: List<TvEntity>?){
        if (tvshows == null) return
        this.listshow.clear()
        this.listshow.addAll(tvshows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowsViewHolder {
        val itemTvShowsBinding =ItemTvShowsBinding.inflate(LayoutInflater.from(parent.context), parent, false )
        return TvShowsViewHolder(itemTvShowsBinding)
    }

    override fun onBindViewHolder(holder: TvShowsViewHolder, position: Int) {
        val tvshows = listshow[position]
        holder.bind(tvshows)
    }

    override fun getItemCount(): Int = listshow.size

    class TvShowsViewHolder(private val binding: ItemTvShowsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("WrongConstant")
        fun bind(data: TvEntity) {
            with(binding) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    tvItemDescription.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD

                }
                tvItemTitle.text = data.title
                tvItemRelease.text = data.release
                tvItemDescription.text = data.description
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvShowsActivity::class.java)
                    intent.putExtra(DetailTvShowsActivity.EXTRA_TV_SHOW, data.title)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(data.poster)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(imgPoster)
            }
        }
    }
}