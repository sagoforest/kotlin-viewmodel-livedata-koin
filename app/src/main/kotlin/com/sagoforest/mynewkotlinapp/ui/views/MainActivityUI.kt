package com.sagoforest.mynewkotlinapp.ui.views

import android.view.Gravity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.textChangedListener

/**
 * TODO: Add a class header comment!
 *
 * Created by andy on 9/4/18
 */
class MainActivityUI : AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        val viewModel = ui.owner.viewModel
        frameLayout {

            /**
             * Set up the edit text field
             */
            editText {
                hint = "Text for toasts and snackbars"
                textChangedListener {
                    afterTextChanged {
                        viewModel.setMessage(text.toString())
                    }
                }
            }.lparams(width = matchParent) {
                margin = dip(12)
                topMargin = dip(30)
            }

            imageView {
                bindContext(viewModel, ui.owner)
            }

            buttonsView {
                bindContext(this@frameLayout, viewModel)

            }.lparams {
                gravity = Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL
                bottomMargin = dip(72)
            }
        }
    }
}