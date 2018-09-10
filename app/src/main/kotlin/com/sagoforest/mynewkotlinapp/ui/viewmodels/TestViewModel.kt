/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
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