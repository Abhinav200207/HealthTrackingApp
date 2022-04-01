package com.example.healthtrackingapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.healthtrackingapp.repositories.MainRepository
import dagger.hilt.android.scopes.ViewModelScoped

class StatisticsViewModel @ViewModelScoped constructor(val mainRepository: MainRepository) : ViewModel() {}