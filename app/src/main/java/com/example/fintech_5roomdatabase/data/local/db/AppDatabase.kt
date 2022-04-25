package com.example.fintech_5roomdatabase.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.fintech_5roomdatabase.data.local.db.dao.FlowerDao
import com.example.fintech_5roomdatabase.data.local.db.model.FlowerEntity

@Database( entities = [FlowerEntity::class], version = 1 )
abstract class AppDatabase : RoomDatabase() {

    abstract fun flowerDao(): FlowerDao

    companion object {
        private var instance: AppDatabase? = null

        fun newInstance( context: Context ): AppDatabase = instance ?: Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "financeapp.db"
        ).build().also {
            instance = it
        }
    }

}