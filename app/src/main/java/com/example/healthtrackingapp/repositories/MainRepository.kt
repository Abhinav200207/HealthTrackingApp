package com.example.healthtrackingapp.repositories

import com.example.healthtrackingapp.database.Run
import com.example.healthtrackingapp.database.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {
    suspend fun insertRun(run: Run){
        return runDao.insertRun(run)
    }

    suspend fun deleteRun(run: Run){
        return runDao.deleteRun(run)
    }

    fun getAllRunsOrderByDate() = runDao.getAllRunsOrderByDate()

    fun getAllRunsOrderByTimeInMilliSecond() = runDao.getAllRunsOrderByTimeInMilliSecond()

    fun getAllRunsOrderByCalories() = runDao.getAllRunsOrderByCalories()

    fun getAllRunsOrderBySpeed() = runDao.getAllRunsOrderBySpeed()

    fun getAllRunsOrderByDistance() = runDao.getAllRunsOrderByDistance()

    fun getTotalTime() = runDao.getTotalTime()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalDistanceCovered() = runDao.getTotalDistanceCovered()

    fun getAvgSpeed() = runDao.getAvgSpeed()
}