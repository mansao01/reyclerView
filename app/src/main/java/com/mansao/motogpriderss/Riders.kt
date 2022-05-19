package com.mansao.motogpriderss

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Riders(
    var image: Int = 0,
    var name: String = "",
    var desc: String = ""
) : Parcelable