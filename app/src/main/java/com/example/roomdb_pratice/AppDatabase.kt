package com.example.roomdb_pratice

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.util.wrapMappedColumns

@Database(entities = [User::class], version = 1)
abstract class AppDatabase :RoomDatabase() {
    abstract fun userDao(): UserDAO

    companion object{
        private var appDatabase:AppDatabase? = null

        @Synchronized
        fun getInstance(context: Context) : AppDatabase?{
            if(appDatabase == null){
                synchronized(AppDatabase::class.java){
                    appDatabase = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "app-database"
                    ).allowMainThreadQueries().build()
                }
            }
            return appDatabase
        }
    }
}