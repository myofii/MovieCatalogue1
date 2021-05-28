package com.yofi.moviecatalogue.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.yofi.moviecatalogue.R
import com.yofi.moviecatalogue.data.Dummy
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {
    private val dummyMovie = Dummy.getDataMovie()
    private val dummyTvShow = Dummy.getDataTvShow()

    @get:Rule
    var activity = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {

    }

    @After
    fun tearDown() {

    }

    @Test
    fun onCreate() {

    }

    @Test
    fun loadMovie() {
        onView(withId(R.id.rvFilm)).check(matches(isDisplayed()))
        onView(withId(R.id.rvFilm)).perform(
            RecyclerViewAction.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )
    }
}