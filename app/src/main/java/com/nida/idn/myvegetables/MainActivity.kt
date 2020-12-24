package com.nida.idn.myvegetables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<Vegetables>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_main.setHasFixedSize(true)
        list.addAll(getDataVegetables())
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rv_main.layoutManager = LinearLayoutManager(this)
        val listVegetablesadapter = List_VegetablesAdapter(list)
        rv_main.adapter = listVegetablesadapter
    }

    private fun getDataVegetables(): ArrayList<Vegetables> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listVegetables = ArrayList<Vegetables>()
        for (position in dataName.indices) {
            val vegetables = Vegetables(
                dataName[position],
                dataDescription[position],
                dataPhoto[position]
            )
            listVegetables.add(vegetables)
        }
        return listVegetables
    }
}
