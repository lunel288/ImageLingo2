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

    @Query("SELECT englishSentence FROM MyObjects_table WHERE englishObject = :obj")
    fun getEnglishSentence(obj: String): String

    @Query("SELECT maoriSentence FROM MyObjects_table WHERE englishObject = :obj")
    fun getMaoriSentence(obj: String): String

    @Query("SELECT samoanSentence FROM MyObjects_table WHERE englishObject = :obj")
    fun getSamoanSentence(obj: String): String

    @Query("SELECT japaneseSentence FROM MyObjects_table WHERE englishObject = :obj")
    fun getJapaneseSentence(obj: String): String

    //@Query("SELECT * FROM myobjects_table ORDER BY id ASC")
}