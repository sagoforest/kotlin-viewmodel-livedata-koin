/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.sagoforest.mynewkotlinapp.di

import com.sagoforest.mynewkotlinapp.da.FakeStringRepostiory
import com.sagoforest.mynewkotlinapp.da.IStringRepository
import com.sagoforest.mynewkotlinapp.ui.viewmodels.TestViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

/**
 * TODO: Add a class header comment!
 *
 * Created by andy on 9/4/18
 */

var appModule = module {

    // singleton repo
    single<IStringRepository>{ FakeStringRepostiory() }

    viewModel{ TestViewModel(get()) }
}