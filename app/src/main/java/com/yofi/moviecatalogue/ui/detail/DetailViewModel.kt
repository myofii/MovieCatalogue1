package com.yofi.moviecatalogue.ui.detail

import androidx.lifecycle.ViewModel
import com.yofi.moviecatalogue.data.DataEntity
import com.yofi.moviecatalogue.data.Dummy

class DetailViewModel: ViewModel() {

    fun getDetailMovieById(id: String): DataEntity {
        var listMovie = Dummy.getDataMovie()
        lateinit var result: DataEntity
        for (movie in listMovie) {
            if (movie.id == id) {
                result = movie
                break
            }
        }
        return result
    }

    fun getDetailTvShowById(id: String): DataEntity {
        var listTvShow = Dummy.getDataTvShow()
        lateinit var result: DataEntity
        for (tvShow in listTvShow) {
            if (tvShow.id == id) {
                result = tvShow
                break
            }
        }
        return result
    }
}
