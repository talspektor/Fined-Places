package com.talspektor.finedplaces.fragments

import androidx.lifecycle.ViewModel
import com.talspektor.finedplaces.Place

class DetailsViewModel : ViewModel() {

    lateinit var palces: List<Place>

    override fun onCleared() {
        super.onCleared()
        // TODO: Dispose All Subscriptions to avoid memory leaks
    }
}