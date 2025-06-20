package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlantAdapter(private val plantList: List<PlantModel>) : RecyclerView.Adapter<PlantAdapter.PlantViewHolder>() {

    class PlantViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val plantImage: ImageView = view.findViewById(R.id.plant_image)
        val plantName: TextView = view.findViewById(R.id.plant_name)
        val plantType: TextView = view.findViewById(R.id.plant_type)
        val plantPrice: TextView = view.findViewById(R.id.plant_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_plant, parent, false)
        return PlantViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {
        val plant = plantList[position]
        holder.plantImage.setImageResource(plant.imageRes)
        holder.plantName.text = plant.name
        holder.plantType.text = plant.type
        holder.plantPrice.text = plant.price
    }

    override fun getItemCount(): Int {
        return plantList.size
    }
}
