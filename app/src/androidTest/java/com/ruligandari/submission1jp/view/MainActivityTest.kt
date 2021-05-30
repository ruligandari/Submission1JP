package com.ruligandari.submission1jp.view

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.ruligandari.submission1jp.R
import com.ruligandari.submission1jp.utils.DataDummy
import com.ruligandari.submission1jp.view.detail.DetailMoviesActivity
import org.junit.Rule
import org.junit.Test

class MainActivityTest{
    private val dummyMovies = DataDummy.generateMoviesDummy()
    private val dummyTvShows = DataDummy.generateTvShowsDummy()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies(){
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }
    @Test
    fun loadTvShows(){
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tv_shows)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_shows)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShows.size))
    }
    @Test
    fun loadDetailMovies(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.title_production)).check(matches(isDisplayed()))
        onView(withId(R.id.title_production)).check(matches(withText("Production")))
        onView(withId(R.id.title_actor)).check(matches(isDisplayed()))
        onView(withId(R.id.title_actor)).check(matches(withText("Actors")))
        onView(withId(R.id.tv_item_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_title)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.tv_item_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_description)).check(matches(withText(dummyMovies[0].description)))
        onView(withId(R.id.tv_item_release)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_release)).check(matches(withText(dummyMovies[0].realease)))
        onView(withId(R.id.tv_item_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_rating)).check(matches(withText(dummyMovies[0].rating)))
        onView(withId(R.id.tv_item_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_genre)).check(matches(withText(dummyMovies[0].genre)))
        onView(withId(R.id.tv_item_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_duration)).check(matches(withText(dummyMovies[0].duration)))
        onView(withId(R.id.tv_item_production)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_production)).check(matches(withText(dummyMovies[0].producer)))
        onView(withId(R.id.tv_item_actor)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_actor)).check(matches(withText(dummyMovies[0].actor)))
    }
    @Test
    fun loadDetailTvShows(){
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tv_shows)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.title_production)).check(matches(isDisplayed()))
        onView(withId(R.id.title_production)).check(matches(withText("Creator")))
        onView(withId(R.id.title_actor)).check(matches(isDisplayed()))
        onView(withId(R.id.title_actor)).check(matches(withText("Cast")))
        onView(withId(R.id.tv_item_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_title)).check(matches(withText(dummyTvShows[0].title)))
        onView(withId(R.id.tv_item_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_description)).check(matches(withText(dummyTvShows[0].description)))
        onView(withId(R.id.tv_item_release)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_release)).check(matches(withText(dummyTvShows[0].release)))
        onView(withId(R.id.tv_item_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_rating)).check(matches(withText(dummyTvShows[0].rating)))
        onView(withId(R.id.tv_item_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_genre)).check(matches(withText(dummyTvShows[0].genre)))
        onView(withId(R.id.tv_item_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_duration)).check(matches(withText(dummyTvShows[0].duration)))
        onView(withId(R.id.tv_item_production)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_production)).check(matches(withText(dummyTvShows[0].creator)))
        onView(withId(R.id.tv_item_actor)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_actor)).check(matches(withText(dummyTvShows[0].cast)))
    }
}