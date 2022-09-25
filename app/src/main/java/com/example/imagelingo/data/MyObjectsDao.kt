package com.example.imagelingo.data

import androidx.room.Dao
import androidx.room.Query


@Dao
interface MyObjectsDao {

    @Query("SELECT maoriObject FROM MyObjects_table WHERE englishObject = :obj")
    fun getMaoriWord(obj: String): String

    @Query("SELECT samoanObject FROM MyObjects_table WHERE englishObject = :obj")
    fun getSamoanWord(obj: String): String

    @Query("SELECT japaneseObject FROM MyObjects_table WHERE englishObject = :obj")
    fun getJapaneseWord(obj: String): String
}