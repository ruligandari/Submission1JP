package com.ruligandari.submission1jp.viewmodel

import com.ruligandari.submission1jp.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DetailMovieViewModelTest{
    private lateinit var viewmodel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateMoviesDummy()[0]
    private val title = dummyMovie.title

    @Before
    fun setUp(){
        viewmodel = DetailMovieViewModel()
        viewmodel.setSelectedMovie(title)
    }

    @Test
    fun getMovie(){
        viewmodel.setSelectedMovie(dummyMovie.title)
        val moviesEntity = viewmodel.getMovie()
        assertNotNull(moviesEntity)
        assertEquals(dummyMovie.poster, moviesEntity.poster)
        assertEquals(dummyMovie.title, moviesEntity.title)
        assertEquals(dummyMovie.realease, moviesEntity.realease)
        assertEquals(dummyMovie.rating, moviesEntity.rating)
        assertEquals(dummyMovie.duration, moviesEntity.duration)
        assertEquals(dummyMovie.genre, moviesEntity.genre)
        assertEquals(dummyMovie.producer, moviesEntity.producer)
        assertEquals(dummyMovie.actor, moviesEntity.actor)
        assertEquals(dummyMovie.description, moviesEntity.description)
    }
}