package com.bignerdranch.android.appbank.modul.one


import com.google.gson.annotations.SerializedName

data class Number(
    @SerializedName("length")
    val length: Int,
    @SerializedName("luhn")
    val luhn: Boolean
)