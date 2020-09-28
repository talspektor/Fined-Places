package com.talspektor.finedplaces.model

import android.os.Parcel
import android.os.Parcelable

class PlaceUIModel() : Parcelable {

    private val name: String? = null
    private val address: String? = null
    private val placeId: String? = null
    private val photoReference: String? = null
//    private val photoHeight: Int? = 48
//    private val photoWidth: Int? = 48
    private val lat: Double? = 0.0
    private val lng: Double? = 0.0

    constructor(parcel: Parcel) : this()

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlaceUIModel> {
        override fun createFromParcel(parcel: Parcel): PlaceUIModel {
            return PlaceUIModel(parcel)
        }

        override fun newArray(size: Int): Array<PlaceUIModel?> {
            return arrayOfNulls(size)
        }
    }
}