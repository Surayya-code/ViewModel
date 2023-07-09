package com.example.viewmodel.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeMVVM:ViewModel() {

  private  val _counter=MutableLiveData<Int>(0)
    val counter:LiveData<Int> = _counter

    fun increaseNumber(number:Int){
        _counter.postValue(number+1)

    }
    fun decreaseNumber(number: Int){
            _counter.value=number-1

    }
}