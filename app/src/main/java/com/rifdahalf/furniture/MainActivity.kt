package com.rifdahalf.furniture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<Furniture>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_main.setHasFixedSize(true)
        list.addAll(getDataFurniture())
        ShowRecyclerList()
    }

    private fun ShowRecyclerList() {
        rv_main.layoutManager = LinearLayoutManager(this)
        val listFurnitureAdapter = ListFurnitureAdapter (list)
        rv_main.adapter =listFurnitureAdapter
    }

    private fun getDataFurniture(): Collection<Furniture> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataPrice = resources.getStringArray(R.array.data_price)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listFurniture = ArrayList<Furniture>()
        for (position in dataName.indices){
            val furniture = Furniture(
                dataName[position],
                dataPrice[position],
                dataDescription[position],
                dataPhoto[position]
            )
            listFurniture.add(furniture)
        }
        return listFurniture
    }
}