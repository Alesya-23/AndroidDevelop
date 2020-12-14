package com.example.androidversions

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Android(val title: String, @DrawableRes val imageAndroid: Int) : Parcelable {}
