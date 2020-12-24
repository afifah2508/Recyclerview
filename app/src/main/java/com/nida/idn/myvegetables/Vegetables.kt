package com.nida.idn.myvegetables

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Vegetables(
    var name : String,
    var description : String,
    var photo : String
) : Parcelable
