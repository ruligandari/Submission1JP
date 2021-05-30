package com.ruligandari.submission1jp.viewmodel

import androidx.lifecycle.ViewModel
import com.ruligandari.submission1jp.model.MoviesEntity
import com.ruligandari.submission1jp.utils.DataDummy

class MoviesViewModel: ViewModel() {
    fun getMovies(): List<MoviesEntity> = DataDummy.generateMoviesDummy()
}