package com.ruligandari.submission1jp.viewmodel

import androidx.lifecycle.ViewModel
import com.ruligandari.submission1jp.model.MoviesEntity
import com.ruligandari.submission1jp.utils.DataDummy

class DetailMovieViewModel: ViewModel() {
    private lateinit var titleMovie: String

    fun setSelectedMovie(movie: String){
        this.titleMovie = movie
    }
    fun getMovie(): MoviesEntity{
        lateinit var movie: MoviesEntity
        val moviesEntities = DataDummy.generateMoviesDummy()
        for (movieEntity in moviesEntities){
            if (movieEntity.title == titleMovie){
                movie = movieEntity
            }
        }
        return movie
    }
}