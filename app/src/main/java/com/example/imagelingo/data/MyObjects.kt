package com.example.imagelingo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "MyObjects_table")
data class MyObjects (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val englishObject: String,
    val maoriObject: String,
    val samoanObject: String,
    val japaneseObject: String,
    val englishSentence: String,
    val maoriSentence: String,
    val samoanSentence: String,
    val japaneseSentence: String
)