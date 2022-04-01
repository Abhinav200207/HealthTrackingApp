package com.example.healthtrackingapp.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM run_table ORDER BY timestamp DESC")
    fun getAllRunsOrderByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY timeInMillis DESC")
    fun getAllRunsOrderByTimeInMilliSecond(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY caloriesBurned DESC")
    fun getAllRunsOrderByCalories(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY avgSpeedInKMH DESC")
    fun getAllRunsOrderBySpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY distanceInMeters DESC")
    fun getAllRunsOrderByDistance(): LiveData<List<Run>>

    @Query("SELECT SUM(timeInMillis) FROM run_table")
    fun getTotalTime(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM run_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT SUM(distanceInMeters) FROM run_table")
    fun getTotalDistanceCovered(): LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKMH) FROM run_table")
    fun getAvgSpeed(): LiveData<Float>

}