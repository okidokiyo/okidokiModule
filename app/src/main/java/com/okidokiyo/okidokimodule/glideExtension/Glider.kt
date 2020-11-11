package com.okidokiyo.okidokimodule.glideExtension

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.centerCrop(
    url: String,
    placeholder: Int
) {
    Glide
        .with(context)
        .load(url)
        .centerCrop()
        .placeholder(placeholder)
        .into(this)
}

fun ImageView.circleCrop(
    url: String,
    placeholder: Int
) {
    Glide
        .with(this.context)
        .load(url)
        .circleCrop()
        .placeholder(placeholder)
        .into(this)
}