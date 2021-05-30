package com.ruligandari.submission1jp.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ruligandari.submission1jp.databinding.FragmentMoviesBinding
import com.ruligandari.submission1jp.view.adapter.MoviesAdapter
import com.ruligandari.submission1jp.viewmodel.MoviesViewModel

class MoviesFragment: Fragment() {
    private lateinit var fragmentMoviesBinding: FragmentMoviesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMoviesBinding = FragmentMoviesBinding.inflate(layoutInflater, container, false)
        return fragmentMoviesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MoviesViewModel::class.java]
            val movies = viewModel.getMovies()

            val moviesAdapter = MoviesAdapter()
            moviesAdapter.setMovies(movies)

            showLoading(true)

            with(fragmentMoviesBinding.rvMovie){
                layoutManager =LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = moviesAdapter
                showLoading(false)
            }
        }
    }

    private fun showLoading(state : Boolean){
        if (state){
            fragmentMoviesBinding.progressBar.visibility = View.VISIBLE
        } else {
            fragmentMoviesBinding.progressBar.visibility = View.GONE
        }
    }
}