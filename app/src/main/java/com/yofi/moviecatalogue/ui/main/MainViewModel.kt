package com.yofi.moviecatalogue.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yofi.moviecatalogue.data.DataEntity
import com.yofi.moviecatalogue.data.Dummy

class MainViewModel: ViewModel() {
//    val listMovie = MutableLiveData<ArrayList<DataEntity>>()
//    val listTvShow = MutableLiveData<ArrayList<DataEntity>>()

    fun getListMovie(): ArrayList<DataEntity> =  Dummy.getDataMovie()
    fun getListTvShow(): ArrayList<DataEntity> = Dummy.getDataTvShow()
}