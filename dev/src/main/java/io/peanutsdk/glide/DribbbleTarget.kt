/*
 * Copyright (c) 2018. Property of Dennis Kwabena Bilson. No unauthorized duplication of this material should be made without prior permission from the developer
 */

package io.peanutsdk.glide

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat
import android.support.v7.graphics.Palette
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.bumptech.glide.request.target.DrawableImageViewTarget
import com.bumptech.glide.request.transition.Transition
import io.peanutsdk.R
import io.peanutsdk.util.ColorUtils
import io.peanutsdk.util.ViewUtils
import io.peanutsdk.util.isAnimated
import io.peanutsdk.util.measured
import io.peanutsdk.widget.BadgedFourThreeImageView


/**
 * A Glide [com.bumptech.glide.request.target.ViewTarget] for [BadgedFourThreeImageView]s.
 * It applies a badge for animated images, can prevent GIFs from auto-playing & applies a palette
 * generated ripple.
 */
class DribbbleTarget(
        private val badgedImageView: BadgedFourThreeImageView,
        private val autoplayGifs: Boolean
) : DrawableImageViewTarget(badgedImageView), Palette.PaletteAsyncListener {

    override fun onResourceReady(drawable: Drawable, transition: Transition<in Drawable>?) {
        super.onResourceReady(drawable, transition)
        val isAnimated = drawable.isAnimated()
        if (!autoplayGifs && isAnimated) {
            (drawable as GifDrawable).stop()
        }
        val bitmap = drawable.getBitmap() ?: return
        Palette.from(bitmap).clearFilters().generate(this)
        if (isAnimated) {
            // look at the area the badge covers to determine its color
            badgedImageView.measured(this::setBadgeColor)
        }
    }

    override fun onStart() {
        if (autoplayGifs) {
            super.onStart()
        }
    }

    override fun onStop() {
        if (autoplayGifs) {
            super.onStop()
        }
    }

    override fun onGenerated(palette: Palette) {
        badgedImageView.foreground = ViewUtils.createRipple(palette, 0.25f, 0.5f,
                ContextCompat.getColor(view.context, R.color.mid_grey), true)
    }

    private fun setBadgeColor() {
        val biv = badgedImageView
        biv.drawable.getBitmap()?.let {
            val badgePos = biv.badgeBounds
            // badge position in view coordinates but bitmap might be smaller, so need to scale it
            // to sample the correct portion that the badge will overlay
            val scale = it.width.toFloat() / biv.width
            val left = (badgePos.left * scale).toInt()
            val top = (badgePos.top * scale).toInt()
            val width = (badgePos.width() * scale).toInt()
            val height = (badgePos.height() * scale).toInt()
            val corner = Bitmap.createBitmap(it, left, top, width, height)
            val isDark = ColorUtils.isDark(corner)
            corner.recycle()
            biv.setBadgeColor(ContextCompat.getColor(biv.context,
                    if (isDark) R.color.gif_badge_dark_image else R.color.gif_badge_light_image))
        }
    }

}