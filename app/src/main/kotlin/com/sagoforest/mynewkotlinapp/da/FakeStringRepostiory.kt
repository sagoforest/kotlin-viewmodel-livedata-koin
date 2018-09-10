/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.sagoforest.mynewkotlinapp.da

/**
 * TODO: Add a class header comment!
 *
 * Created by andy on 9/4/18
 */
class FakeStringRepostiory : IStringRepository {
    override fun giveHello(): String = "Hello Koin"
}