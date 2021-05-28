package com.yofi.moviecatalogue.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.yofi.moviecatalogue.R
import com.yofi.moviecatalogue.databinding.FragmentListBinding

class MoviesFragment: Fragment(R.layout.fragment_list) {
    private var _binding : FragmentListBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: ListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentListBinding.bind(view)

        adapter = ListAdapter()
        adapter.notifyDataSetChanged()

        binding.apply {
            rvFilm.setHasFixedSize(true)
            rvFilm.layoutManager = LinearLayoutManager(activity)
            rvFilm.adapter = adapter
        }

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MainViewModel::class.java)

        adapter.setListDataFilm(viewModel.getListMovie())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}