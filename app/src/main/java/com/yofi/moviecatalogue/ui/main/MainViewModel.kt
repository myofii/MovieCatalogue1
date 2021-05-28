package com.yofi.moviecatalogue.ui.main

import androidx.lifecycle.ViewModel
import com.yofi.moviecatalogue.data.DataEntity
import com.yofi.moviecatalogue.data.Dummy

class MainViewModel: ViewModel() {
    fun getListMovie(): ArrayList<DataEntity> =  Dummy.getDataMovie()
    fun getListTvShow(): ArrayList<DataEntity> = Dummy.getDataTvShow()
}