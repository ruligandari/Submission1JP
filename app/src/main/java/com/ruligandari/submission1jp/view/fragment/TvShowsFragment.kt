package com.ruligandari.submission1jp.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ruligandari.submission1jp.databinding.FragmentTvShowsBinding
import com.ruligandari.submission1jp.view.adapter.TvShowsAdapter
import com.ruligandari.submission1jp.viewmodel.TvShowsViewModel

class TvShowsFragment: Fragment() {
    private lateinit var fragmentTvShowsBinding: FragmentTvShowsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentTvShowsBinding = FragmentTvShowsBinding.inflate(layoutInflater, container, false)
        return fragmentTvShowsBinding.root
    }

    private fun showLoading (state: Boolean){
        if(state){
            fragmentTvShowsBinding.progressBar.visibility = View.VISIBLE
        } else {
            fragmentTvShowsBinding.progressBar.visibility = View.GONE
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowsViewModel::class.java]
            val tvshow = viewModel.getTvShows()

            val tvShowsAdapter = TvShowsAdapter()

            tvShowsAdapter.setTvShows(tvshow)

            showLoading(true)
            with(fragmentTvShowsBinding.rvTvShows){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowsAdapter
                showLoading(false)
            }
        }
    }
}