package com.ruligandari.submission1jp.viewmodel

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class TvShowsViewModelTest{
    private lateinit var viewmodel: TvShowsViewModel

    @Before
    fun setup(){
        viewmodel = TvShowsViewModel()
    }

    @Test
    fun getTvShows(){
        val tvShowsEntities =viewmodel.getTvShows()
        assertNotNull(tvShowsEntities)
        assertEquals(10, tvShowsEntities.size)
    }
}