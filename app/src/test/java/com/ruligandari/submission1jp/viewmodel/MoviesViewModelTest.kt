package com.ruligandari.submission1jp.viewmodel


import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


class MoviesViewModelTest{
    private lateinit var viewmodel : MoviesViewModel

    @Before
    fun setup(){
        viewmodel = MoviesViewModel()
    }

    @Test
    fun getMovies(){
        val moviesEntities =viewmodel.getMovies()
        assertNotNull(moviesEntities)
        assertEquals(10, moviesEntities.size)
    }
}