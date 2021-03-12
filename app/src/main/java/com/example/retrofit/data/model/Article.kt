package com.example.retrofit.data.model

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Article(
    @Json(name = "author") val author: String? = "",
    @Json(name = "title") val title: String = "",
    @Json(name = "description") val description: String? = "",
    @Json(name = "url") val url: String = "",
    @Json(name = "publishedAt") val publishedAt: String = "",
    @Json(name = "content") val content: String? = ""
): Parcelable