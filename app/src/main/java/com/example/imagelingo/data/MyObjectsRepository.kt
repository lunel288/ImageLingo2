package com.example.imagelingo.data

import androidx.lifecycle.LiveData


class MyObjectsRepository (private val myObjectsDao: MyObjectsDao){


    fun getMaoriWord(string: String) : LiveData<String>{
        return myObjectsDao.getMaoriWord(string)
    }

     fun getMaoriSentence(string: String) : LiveData<String>{
        return myObjectsDao.getMaoriSentence(string)
    }

     fun getEnglishSentence(string: String) : LiveData<String>{
        return myObjectsDao.getEnglishSentence(string)
    }

}