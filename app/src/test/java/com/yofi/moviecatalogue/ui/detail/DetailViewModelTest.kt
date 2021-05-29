package com.yofi.moviecatalogue.detail

import com.yofi.moviecatalogue.data.Dummy
import com.yofi.moviecatalogue.ui.detail.DetailViewModel
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {
    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = Dummy.getDataMovie()[0]
    private val dummyTvShow = Dummy.getDataTvShow()[0]

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
    }

    @Test
    fun getDetailMovieById() {
        val movieEntity = dummyMovie.id?.let { viewModel.getDetailMovieById(it) }
        assertNotNull(movieEntity)
        if (movieEntity != null) {
            assertEquals(dummyMovie.id, movieEntity.id)
            assertEquals(dummyMovie.type, movieEntity.type)
            assertEquals(dummyMovie.name, movieEntity.name)
            assertEquals(dummyMovie.year, movieEntity.year)
            assertEquals(dummyMovie.genre, movieEntity.genre)
            assertEquals(dummyMovie.rating, movieEntity.rating)
            assertEquals(dummyMovie.desc, movieEntity.desc)
            assertEquals(dummyMovie.poster, movieEntity.poster)
        }
    }

    @Test
    fun getDetailTvShowById() {
        val tvShowEntity = dummyTvShow.id?.let { viewModel.getDetailTvShowById(it) }
        assertNotNull(tvShowEntity)
        if (tvShowEntity != null) {
            assertEquals(dummyTvShow.id, tvShowEntity.id)
            assertEquals(dummyTvShow.type, tvShowEntity.type)
            assertEquals(dummyTvShow.name, tvShowEntity.name)
            assertEquals(dummyTvShow.year, tvShowEntity.year)
            assertEquals(dummyTvShow.genre, tvShowEntity.genre)
            assertEquals(dummyTvShow.rating, tvShowEntity.rating)
            assertEquals(dummyTvShow.desc, tvShowEntity.desc)
            assertEquals(dummyTvShow.poster, tvShowEntity.poster)
        }
    }
}