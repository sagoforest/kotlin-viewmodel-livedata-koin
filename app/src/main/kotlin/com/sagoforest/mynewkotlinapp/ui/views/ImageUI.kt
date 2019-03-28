/*
 * Copyright (c) 2018. This belongs to ANDY!!
 */

package com.sagoforest.mynewkotlinapp.ui.views

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.Observer
import android.content.Context
import android.content.res.ColorStateList
import android.view.Gravity.CENTER
import android.view.ViewManager
import android.widget.ImageView
import android.widget.LinearLayout
import com.sagoforest.mynewkotlinapp.R
import com.sagoforest.mynewkotlinapp.ui.viewmodels.TestViewModel
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.dip
import org.jetbrains.anko.imageView
import org.jetbrains.anko.padding
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * TODO: Add a class header comment!
 *
 * Created by andy on 9/6/18
 */


class ImageUI(context: Context, viewModel: TestViewModel, lifecycleOwner: LifecycleOwner) : LinearLayout(context) {

    private lateinit var image: ImageView

    init {
        AnkoContext.createDelegate(this).apply {
            gravity = CENTER
            padding = dip(24)
            image = imageView(imageResource = R.drawable.ic_android_black_24dp) {
                onClick { viewModel.toggleClicked() }
                padding = dip(8)
                layoutParams = LinearLayout.LayoutParams(dip(48), dip(48))
            }
            viewModel.isClicked.observe(lifecycleOwner, Observer { it?.let { updateColor(it) } })
        }
    }

    private fun updateColor(isClicked: Boolean) {
        val colorId = if (isClicked) R.color.colorPrimary else R.color.colorHappy
        val color = resources.getColor(colorId, null)
        image.imageTintList = ColorStateList.valueOf(color)
    }

}

@Suppress("NOTHING_TO_INLINE")
inline fun ViewManager.imageView(viewModel: TestViewModel, lifecycleOwner: LifecycleOwner, theme: Int = 0) =
        imageView(viewModel, lifecycleOwner, theme) {}

inline fun ViewManager.imageView(viewModel: TestViewModel, lifecycleOwner: LifecycleOwner, theme: Int = 0, init: ImageUI.() -> Unit) =
        ankoView({ ImageUI(it, viewModel, lifecycleOwner) }, theme, init)
