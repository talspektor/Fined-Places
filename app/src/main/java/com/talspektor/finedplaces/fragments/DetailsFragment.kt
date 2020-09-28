package com.talspektor.finedplaces.fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.talspektor.finedplaces.Constants
import com.talspektor.finedplaces.Keys
import com.talspektor.finedplaces.R
import com.talspektor.finedplaces.controllers.DetailsPlacesRecyclerAdapter
import com.talspektor.finedplaces.networking.GetPlacesService
import com.talspektor.finedplaces.networking.RetrofitInstance

class DetailsFragment : Fragment() {

    companion object {
        fun newInstance() = DetailsFragment()
    }

    private lateinit var viewModel: DetailsViewModel
    private lateinit var recyclerAdapter: DetailsPlacesRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        recyclerAdapter = DetailsPlacesRecyclerAdapter(context!!, viewModel.palces)
        return inflater.inflate(R.layout.details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)
        // TODO: Use the ViewModel
        val latLong = "${Constants.TEL_AVIV_LAT},${Constants.TEL_AVIV_LNG}"
        val radios = "${Constants.RADIUS_KEY}=${Constants.DEFAULT_RADIUS_VALUE}"
        val pypes = ""
        val retrofit = RetrofitInstance().retrofit
        val service = retrofit.create(GetPlacesService::class.java)
        val call = service.getPlaces("json?location=${latLong}&${radios}&${Constants.KEY}=${Keys.GOOGLE_PLACES_KEY}")
        Log.d("call", "${call.request().url}")

//        val latLong = "${Constants.TEL_AVIV_LAT},${Constants.TEL_AVIV_LNG}"
//        val service = RetrofitInstance.instance.create(GetPlacesService::class.java)
//        val call = service.getPlaces(latLong, Constants.RADIUS_KEY, Constants.DEFAULT_RADIUS_VALUE)
//        call.enqueue(this)
    }

}