package com.example.healthtrackingapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.healthtrackingapp.R
import com.example.healthtrackingapp.ui.viewmodel.MainViewModel
import com.example.healthtrackingapp.ui.viewmodel.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics){

    private val viewModel : StatisticsViewModel by viewModels()
}