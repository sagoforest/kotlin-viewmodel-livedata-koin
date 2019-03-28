/*
 * Copyright (c) 2018. This belongs to ANDY!!
 */


package com.sagoforest.mynewkotlinapp.ui.views

import android.content.Context
import android.view.ViewManager
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.sagoforest.mynewkotlinapp.ui.viewmodels.TestViewModel
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.button
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.design.longSnackbar
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast

/**
 * TODO: Add a class header comment!
 *
 * Created by andy on 9/6/18
 */


class ButtonsUI(context: Context, frameLayout: FrameLayout, viewModel: TestViewModel) : LinearLayout(context) {


    init {
        AnkoContext.createDelegate(this).apply {
            button("Show Toast") {
                onClick {
                    toast(viewModel.repoMessage)
                }
            }
            button("Long snackbar") {
                onClick {
                    longSnackbar(frameLayout, viewModel.message.value.toString())
                }
            }
        }
    }

}

@Suppress("NOTHING_TO_INLINE")
inline fun ViewManager.buttonsView(frameLayout: FrameLayout, viewModel: TestViewModel, theme: Int = 0) =
        buttonsView(frameLayout, viewModel, theme) {}

inline fun ViewManager.buttonsView(frameLayout: FrameLayout, viewModel: TestViewModel, theme: Int = 0, init: ButtonsUI.() -> Unit) =
        ankoView({ ButtonsUI(it, frameLayout, viewModel) }, theme, init)
