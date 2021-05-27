package com.yofi.moviecatalogue.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.yofi.moviecatalogue.R
import com.yofi.moviecatalogue.data.DataEntity
import com.yofi.moviecatalogue.data.Dummy
import com.yofi.moviecatalogue.databinding.FragmentListBinding
import com.yofi.moviecatalogue.ui.detail.DetailActivity

class TvShowFragment: Fragment(R.layout.fragment_list) {
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

//        showLoading(true)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MainViewModel::class.java)

        adapter.setListDataFilm(Dummy.getDataTvShow())
    }

//    override fun onItemClicked(data: DataEntity) {
//        startActivity(
//            Intent(
//                context,
//                DetailActivity::class.java
//            )
//                .putExtra(DetailActivity.EXTRA_ID, data.id)
//                .putExtra(DetailActivity.EXTRA_TYPE, "TVSHOW")
//        )
//    }

    private fun showLoading(state: Boolean) {
        if(state) {
            binding.progressBar.visibility = View.VISIBLE
        } else {
            binding.progressBar.visibility = View.GONE
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}