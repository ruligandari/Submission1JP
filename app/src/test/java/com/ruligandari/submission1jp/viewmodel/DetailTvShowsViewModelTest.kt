package com.ruligandari.submission1jp.viewmodel

import com.ruligandari.submission1jp.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DetailTvShowsViewModelTest{
    private lateinit var viewmodel: DetailTvShowsViewModel
    private val dummyTvShows = DataDummy.generateTvShowsDummy()[0]
    private val title = dummyTvShows.title

    @Before
    fun setUp(){
        viewmodel = DetailTvShowsViewModel()
        viewmodel.setSelectedTvShows(title)
    }

    @Test
    fun getTvShows(){
        viewmodel.setSelectedTvShows(dummyTvShows.title)
        val tvShowsEntity = viewmodel.getTvShows()
        assertNotNull(tvShowsEntity)
        assertEquals(dummyTvShows.poster, tvShowsEntity.poster)
        assertEquals(dummyTvShows.title, tvShowsEntity.title)
        assertEquals(dummyTvShows.release, tvShowsEntity.release)
        assertEquals(dummyTvShows.rating, tvShowsEntity.rating)
        assertEquals(dummyTvShows.duration, tvShowsEntity.duration)
        assertEquals(dummyTvShows.genre, tvShowsEntity.genre)
        assertEquals(dummyTvShows.creator, tvShowsEntity.creator)
        assertEquals(dummyTvShows.cast, tvShowsEntity.cast)
        assertEquals(dummyTvShows.description, tvShowsEntity.description)
    }
}