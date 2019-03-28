/*
 * Copyright (c) 2018. This belongs to ANDY!!
 */

package com.sagoforest.mynewkotlinapp.ui.viewmodels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.sagoforest.mynewkotlinapp.da.IStringRepository

/**
 * TODO: Add a class header comment!
 *
 * Created by andy on 9/4/18
 */
class TestViewModel(repo: IStringRepository) : ViewModel() {

    private val mIsClicked: MutableLiveData<Boolean> = MutableLiveData()
    private val mMessage: MutableLiveData<String> = MutableLiveData()

    init {
        mIsClicked.value = false
        mMessage.value = "<unknown>"
    }

    val isClicked: LiveData<Boolean> = mIsClicked
    val message: LiveData<String> = mMessage

    val repoMessage: String = repo.giveHello()

    fun setMessage(message: String) {
        mMessage.value = message
    }

    fun toggleClicked() {
        mIsClicked.value = mIsClicked.value?.not()
    }
}