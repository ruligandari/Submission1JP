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
import com.ruligandari.submission1jp.databinding.ItemMoviesBinding
import com.ruligandari.submission1jp.model.MoviesEntity
import com.ruligandari.submission1jp.view.detail.DetailMoviesActivity

class MoviesAdapter: RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {
    private var listmovies = ArrayList<MoviesEntity>()

    fun setMovies(movies: List<MoviesEntity>?) {
        if (movies == null) return
        this.listmovies.clear()
        this.listmovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val itemsMoviesBinding =
            ItemMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(itemsMoviesBinding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val Movies = listmovies[position]
        holder.bind(Movies)
    }

    override fun getItemCount(): Int = listmovies.size

    class MoviesViewHolder(private val binding: ItemMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("WrongConstant")
        fun bind(movies: MoviesEntity) {
            with(binding) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    tvItemDescription.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
                }
                tvItemTitle.text = movies.title
                tvItemDescription.text = movies.description
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMoviesActivity::class.java)
                    intent.putExtra(DetailMoviesActivity.EXTRA_MOVIES, movies.title)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movies.poster)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(imgPoster)
            }
        }
    }
}