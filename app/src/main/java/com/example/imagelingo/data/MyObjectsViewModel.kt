package com.example.imagelingo.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MyObjectsViewModel (application: Application): AndroidViewModel(application){

    private val repository: MyObjectsRepository

    val japaneseSentence = MutableLiveData<String>()
    init{
        val myObjectsDao = MyObjectsDatabase.getDatabase(application).myObjectsDao()
        repository = MyObjectsRepository(myObjectsDao)
    }

    fun getMaoriWord(string: String):LiveData<String>{
        return repository.getMaoriWord(string)

    }

    fun getMaoriSentence(string: String):LiveData<String>{
        return repository.getMaoriSentence(string)

    }

    fun getEnglishSentence(string: String):LiveData<String>{
        return repository.getEnglishSentence(string)

    }

}