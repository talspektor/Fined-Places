package com.talspektor.finedplaces.networking

import com.google.gson.annotations.SerializedName

class PlaceResponse {
    @SerializedName("name")
    var name: String? = null
    @SerializedName("description")
    var description: String? = null
}