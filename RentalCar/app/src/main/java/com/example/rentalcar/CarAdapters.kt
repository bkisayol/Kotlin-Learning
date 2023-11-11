package com.example.rentalcar

import android.content.Context
import android.telecom.Call.Details
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CarAdapters(var context: Context, var arrayList: ArrayList<CardCarList>): BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position:   Int, convertView: View?, parent: ViewGroup?): View {
        val view:View = View.inflate(context, R.layout.car_view_item_layout_list, null)

        var icons:ImageView = view.findViewById(R.id.icon_list)
        var title:TextView = view.findViewById(R.id.title_text_view)
        var detail:TextView = view.findViewById(R.id.detail_text_view)

        var items:CardCarList = arrayList.get(position)
        icons.setImageResource(items.icons!!)
        title.text = items.title
        detail.text = items.detail
        return  view!!
    }
}