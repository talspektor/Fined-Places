package com.talspektor.finedplaces.networking

import com.talspektor.finedplaces.model.PlaceModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

//service to get information from server
interface GetPlacesService {

//    val BASE_URL: String
//        get() = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="

    @GET
    fun getPlaces(@Url url: String): Call<PlaceModel>
}