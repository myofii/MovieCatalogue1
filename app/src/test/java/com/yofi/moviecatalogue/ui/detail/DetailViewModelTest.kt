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
            assertEquals(dummyMovie.id, tvShowEntity.id)
            assertEquals(dummyMovie.type, tvShowEntity.type)
            assertEquals(dummyMovie.name, tvShowEntity.name)
            assertEquals(dummyMovie.year, tvShowEntity.year)
            assertEquals(dummyMovie.genre, tvShowEntity.genre)
            assertEquals(dummyMovie.rating, tvShowEntity.rating)
            assertEquals(dummyMovie.desc, tvShowEntity.desc)
            assertEquals(dummyMovie.poster, tvShowEntity.poster)
        }
    }
}