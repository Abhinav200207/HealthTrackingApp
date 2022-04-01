package com.example.healthtrackingapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.healthtrackingapp.utils.Converters

@Database(entities = [Run::class],version = 1)
@TypeConverters(Converters::class)
abstract class RunDatabase : RoomDatabase() {
    abstract fun getRunDao(): RunDao
}