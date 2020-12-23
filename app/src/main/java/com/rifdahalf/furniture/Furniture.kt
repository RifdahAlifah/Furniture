package com.rifdahalf.furniture

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Furniture (
    val name : String,
    val price : String,
    val description : String,
    val photo : String
):Parcelable