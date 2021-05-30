package com.ruligandari.submission1jp.view.detail

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.text.Layout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ruligandari.submission1jp.R
import com.ruligandari.submission1jp.databinding.ActivityDetailBinding
import com.ruligandari.submission1jp.model.MoviesEntity
import com.ruligandari.submission1jp.viewmodel.DetailMovieViewModel

class DetailMoviesActivity: AppCompatActivity(){
    private lateinit var binding: ActivityDetailBinding

    companion object{
        const val EXTRA_MOVIES = "extra_movies"
    }

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewmodel = ViewModelProvider(this).get(DetailMovieViewModel::class.java)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            binding.tvItemDescription.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
        }

        val extras = intent.extras
        if (extras != null){
            val title = extras.getString(EXTRA_MOVIES)
            if (title != null){
                viewmodel.setSelectedMovie(title)
                detailMovie(viewmodel.getMovie())
            }
        }
    }

    private fun detailMovie(moviesEntity: MoviesEntity){
        val production = "Production"
        val actor = "Actors"

        binding.apply {
            tvItemTitle.text = moviesEntity.title
            tvItemRelease.text = moviesEntity.realease
            tvItemRating.text = moviesEntity.rating
            tvItemDuration.text = moviesEntity.duration
            titleProduction.text = production
            titleActor.text = actor
            tvItemProduction.text = moviesEntity.producer
            tvItemGenre.text = moviesEntity.genre
            tvItemActor.text = moviesEntity.actor
            tvItemDescription.text = moviesEntity.description

            Glide.with(this@DetailMoviesActivity)
                .load(moviesEntity.poster)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                .into(imgPoster)

        }
    }
}