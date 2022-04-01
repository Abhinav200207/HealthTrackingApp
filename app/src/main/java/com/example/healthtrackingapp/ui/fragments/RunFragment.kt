package com.example.healthtrackingapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.healthtrackingapp.R
import com.example.healthtrackingapp.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run){

    private val viewModel : MainViewModel by viewModels()
}