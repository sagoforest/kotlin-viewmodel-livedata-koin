/*
 * Copyright (c) 2018. This belongs to ANDY!!
 */

package com.sagoforest.mynewkotlinapp

import android.app.Application
import com.sagoforest.mynewkotlinapp.di.appModule
import org.koin.android.ext.android.startKoin

/**
 * TODO: Add a class header comment!
 *
 * Created by andy on 9/4/18
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin(this, listOf(appModule))
    }
}