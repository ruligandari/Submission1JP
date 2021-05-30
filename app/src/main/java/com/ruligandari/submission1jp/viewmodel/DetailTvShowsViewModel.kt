package com.ruligandari.submission1jp.viewmodel

import androidx.lifecycle.ViewModel
import com.ruligandari.submission1jp.model.TvEntity
import com.ruligandari.submission1jp.utils.DataDummy

class DetailTvShowsViewModel: ViewModel() {
    private lateinit var titleTvShows: String

    fun setSelectedTvShows(tvShows: String){
        this.titleTvShows = tvShows
    }
    fun getTvShows(): TvEntity {
        lateinit var tvshows: TvEntity
        val tvEntities = DataDummy.generateTvShowsDummy()
        for (TvEntity in tvEntities){
            if (TvEntity.title == titleTvShows){
                tvshows = TvEntity
            }
        }
        return tvshows
    }
}