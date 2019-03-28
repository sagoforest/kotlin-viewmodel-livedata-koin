

/*
 * Copyright (c) 2018. This belongs to ANDY!!
 */

package com.sagoforest.mynewkotlinapp.ui.views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sagoforest.mynewkotlinapp.ui.viewmodels.TestViewModel
import org.jetbrains.anko.setContentView
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val viewModel: TestViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)
    }
}
