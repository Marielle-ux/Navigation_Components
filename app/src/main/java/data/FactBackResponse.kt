package data

import com.google.gson.annotations.SerializedName

data class FactBackResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("Language")
    val language: String,
    @SerializedName("permalink")
    val permalink: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("source_url")
    val source_url:String,
    @SerializedName("text")
    val text: String
)

