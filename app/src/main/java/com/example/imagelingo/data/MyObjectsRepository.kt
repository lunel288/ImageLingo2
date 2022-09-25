package com.example.imagelingo.data


class MyObjectsRepository (private val myObjectsDao: MyObjectsDao){


    suspend fun getMaoriWord(string: String) : String{
        return myObjectsDao.getMaoriWord(string)
    }

    suspend fun getMaoriSentence(string: String) : String{
        return myObjectsDao.getMaoriSentence(string)
    }

    suspend fun getEnglishSentence(string: String) : String{
        return myObjectsDao.getEnglishSentence(string)
    }

}