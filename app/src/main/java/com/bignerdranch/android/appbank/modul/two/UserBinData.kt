package com.bignerdranch.android.appbank.modul.two

import android.os.Parcelable
import com.bignerdranch.android.appbank.modul.one.Country
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserBinData(
    val city: String,
    val name: String,
    val phone: String,
    val url: String,
    val brand: String,
    val number: Number,
    val prepaid: Boolean,
    val scheme: String,
    val type: String


    ) : Parcelable
