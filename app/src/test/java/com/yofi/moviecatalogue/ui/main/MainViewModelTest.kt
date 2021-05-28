package com.yofi.moviecatalogue.ui.main

import org.junit.Before
import org.junit.Test
import org.junit.Assert.*

class MainViewModelTest {
    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun getListMovie() {
        val movie = viewModel.getListMovie()
        assertNotNull(movie)
        assertEquals(10, movie.size)
    }

    @Test
    fun getListTvShow() {
        val tvShow = viewModel.getListTvShow()
        assertNotNull(tvShow)
        assertEquals(10, tvShow.size)
    }
}