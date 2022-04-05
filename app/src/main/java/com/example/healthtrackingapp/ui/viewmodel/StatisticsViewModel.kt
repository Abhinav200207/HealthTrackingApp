package com.example.healthtrackingapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.healthtrackingapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject


@HiltViewModel
class StatisticsViewModel @Inject constructor(val mainRepository: MainRepository) : ViewModel() {

    val totalTimeRun = mainRepository.getTotalTime()
    val totalDistance = mainRepository.getTotalDistanceCovered()
    val totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()
    val totalAvgSpeed = mainRepository.getAvgSpeed()
    val runsSortedByDate = mainRepository.getAllRunsOrderByDate()
}