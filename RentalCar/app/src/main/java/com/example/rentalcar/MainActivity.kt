package com.example.rentalcar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity(), OnItemClickListener{

    private var listView:ListView ? = null
    private var carAdapters:CarAdapters ? =null
    private var arrayList:ArrayList<CardCarList> ? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_cars_card)

        listView = findViewById(R.id.card_view_list_view)
        arrayList = ArrayList()
        arrayList = setDataItem()
        carAdapters =CarAdapters(applicationContext, arrayList!!)
        listView?.adapter=carAdapters
        listView?.onItemClickListener = this
    }

    private fun setDataItem() : ArrayList<CardCarList>{
        var listItem:ArrayList<CardCarList> = ArrayList()
        listItem.add(CardCarList(R.drawable.beep_beep_classic_car,"Classic Car","$34/day"))
        listItem.add(CardCarList(R.drawable.beep_beep_sport_car,"Sport Car","$55/day"))
        listItem.add(CardCarList(R.drawable.beep_beep_flying_car, "Flying Car","$500/day"))
        listItem.add(CardCarList(R.drawable.beep_beep_electric_car,"Electric Car","$45/day"))

        return listItem
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
       var items:CardCarList = arrayList?.get(position)!!
        Toast.makeText(applicationContext, items.title, Toast.LENGTH_LONG).show()
    }
}