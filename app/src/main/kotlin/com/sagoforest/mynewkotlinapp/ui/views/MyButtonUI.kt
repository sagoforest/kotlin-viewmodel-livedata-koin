/*
 * Copyright (c) 2018. This belongs to ANDY!!
 */


package com.sagoforest.mynewkotlinapp.ui.views

import android.content.Context
import android.view.View
import android.view.ViewManager
import android.widget.Button
import android.widget.LinearLayout
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.button
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * TODO: Add a class header comment!
 *
 * Created by andy on 9/6/18
 */


class MyButtonUI(context: Context) : LinearLayout(context) {


    var btext: String = ""
    var command: ()->Unit = {}
    private lateinit var button: Button

    init {
        AnkoContext.createDelegate(this).apply {
            button = button{}
        }
    }

}

inline fun ViewManager.myButton(init: (MyButtonUI).() -> Unit) =
        ankoView(::MyButtonUI, theme = 0) { init(); }
