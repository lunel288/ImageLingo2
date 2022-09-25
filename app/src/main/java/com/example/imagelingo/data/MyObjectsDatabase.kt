package com.example.imagelingo.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [MyObjects::class], version = 1, exportSchema = true)
abstract class MyObjectsDatabase: RoomDatabase() {

    abstract fun myObjectsDao(): MyObjectsDao

    companion object {
        @Volatile
        private var INSTANCE: MyObjectsDatabase? = null

        fun getDatabase(context:Context): MyObjectsDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyObjectsDatabase::class.java,
                    "MyObjects_table"
                ).createFromAsset("database/MyObjects_table.db").build()
                INSTANCE = instance
                return instance
            }

        }


    }

}