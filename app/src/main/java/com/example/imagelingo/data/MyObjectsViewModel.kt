package com.example.imagelingo.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MyObjectsViewModel (application: Application): AndroidViewModel(application){

    private val repository: MyObjectsRepository

    init{
        val myObjectsDao = MyObjectsDatabase.getDatabase(application).myObjectsDao()
        repository = MyObjectsRepository(myObjectsDao)
    }

    fun getMaoriWord(string: String):String{
        var obj: String=""

        viewModelScope.launch(Dispatchers.IO){
            obj = repository.getMaoriWord(string)

        }
        return obj
    }

    fun getMaoriSentence(string: String):String{
        var obj: String=""

        viewModelScope.launch(Dispatchers.IO){
            obj = repository.getMaoriSentence(string)

        }
        return obj
    }

    fun getEnglishSentence(string: String):String{
        var obj: String=""

        viewModelScope.launch(Dispatchers.IO){

            obj = repository.getEnglishSentence(string)

        }
        return obj
    }

}