package com.talspektor.finedplaces.controllers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.talspektor.finedplaces.Place
import com.talspektor.finedplaces.R
import kotlinx.android.synthetic.main.place_item.view.*

class DetailsPlacesRecyclerAdapter(private val context: Context, private val places: List<Place>) : RecyclerView.Adapter<DetailsPlacesRecyclerAdapter.ViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.place_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = places.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = places[position]
        holder.titleTextView.text = place.name
        holder.descriptionTexxtView.text = place.description
        //TODO: set place layout
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView = itemView.titleTextView
        val descriptionTexxtView = itemView.descriptionTextView
        //TODO: add init + set listener
    }


}