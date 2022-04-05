package com.example.healthtrackingapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.healthtrackingapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject


@HiltViewModel
class StatisticsViewModel @Inject constructor(val mainRepository: MainRepository) : ViewModel() {}