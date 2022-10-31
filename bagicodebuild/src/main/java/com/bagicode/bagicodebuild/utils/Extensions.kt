package com.bagicode.bagicodebuild.utils

import android.view.View

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun View.hilang() {
    this.visibility = View.GONE
}