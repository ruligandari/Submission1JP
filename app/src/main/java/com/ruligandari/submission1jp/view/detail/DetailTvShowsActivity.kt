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
import com.ruligandari.submission1jp.model.TvEntity
import com.ruligandari.submission1jp.viewmodel.DetailTvShowsViewModel

class DetailTvShowsActivity: AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    companion object {
        const val EXTRA_TV_SHOW = "extra_tv_show"
    }

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel = ViewModelProvider(this).get(DetailTvShowsViewModel::class.java)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            binding.tvItemDescription.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
        }

        val extras = intent.extras
        if (extras != null){
            val title = extras.getString(EXTRA_TV_SHOW)
            if (title != null){
                viewModel.setSelectedTvShows(title)
                detailTvShows(viewModel.getTvShows())
            }
        }
    }

    private fun detailTvShows(entity: TvEntity){
        val creator = "Creator"
        val cast = "Cast"
        binding.apply {
            tvItemTitle.text = entity.title
            tvItemRelease.text = entity.release
            tvItemRating.text = entity.rating
            tvItemDuration.text = entity.duration
            titleProduction.text = creator
            titleActor.text = cast
            tvItemProduction.text = entity.creator
            tvItemGenre.text = entity.genre
            tvItemActor.text = entity.cast
            tvItemDescription.text = entity.description

            Glide.with(this@DetailTvShowsActivity)
                .load(entity.poster)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                .into(imgPoster)
        }
    }
}