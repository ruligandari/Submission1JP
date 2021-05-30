package com.ruligandari.submission1jp.viewmodel

import androidx.lifecycle.ViewModel
import com.ruligandari.submission1jp.model.TvEntity
import com.ruligandari.submission1jp.utils.DataDummy

class TvShowsViewModel: ViewModel() {
    fun getTvShows(): List<TvEntity> = DataDummy.generateTvShowsDummy()
}