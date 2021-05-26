package com.yofi.moviecatalogue.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.yofi.moviecatalogue.data.DataEntity
import com.yofi.moviecatalogue.databinding.ActivityDetailBinding
import com.yofi.moviecatalogue.databinding.ActivityMainBinding
import com.yofi.moviecatalogue.ui.main.MainViewModel

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var viewModel: DetailViewModel
    private lateinit var result: DataEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailViewModel::class.java)

        val id = intent.getStringExtra(EXTRA_ID)
        val type = intent.getStringExtra(EXTRA_TYPE)

        if (type.equals("MOVIE")) {
            id?.let {
                result = viewModel.getDetailMovieById(it)
            }
        } else if (type.equals("TVSHOW")) {
            id?.let {
                result = viewModel.getDetailTvShowById(id)
            }
        }

        binding.apply {
            Glide.with(this@DetailActivity)
                .load(result.poster)
                .into(imgPoster)
            tvName.text = result.name + " ("+ result.year + ")"
            tvRating.text = result.rating
            tvGenre.text = result.genre
            tvDesc.text = result.desc
        }
    }

    companion object {
        const val EXTRA_ID = "extra_id"
        const val EXTRA_TYPE = "extra_type"
    }
}