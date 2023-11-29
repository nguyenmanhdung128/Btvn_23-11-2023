package com.example.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Adapter(private val arrayList: ArrayList<Message>): BaseAdapter(){
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        view = LayoutInflater.from(parent?.context).inflate(R.layout.item_view, parent, false)

        val obj: Message = arrayList[position]

        val name: TextView = view.findViewById(R.id.Name)
        name.text = obj.Name;
        val image: TextView = view.findViewById(R.id.image)
        image.text = obj.Name.toUpperCase().first().toString()
        var detailMessage: String = obj.Detail
        if(detailMessage.length > 60) detailMessage = detailMessage.substring(0, 60) + "..."
        val detail: TextView = view.findViewById(R.id.detail)
        detail.text = detailMessage
        val hour: TextView = view.findViewById(R.id.hour)
        hour.text = obj.Hour
        when(position % 4){
            0 -> image.setBackgroundResource(R.drawable.circle_1)
            1 -> image.setBackgroundResource(R.drawable.circle_2)
            2 -> image.setBackgroundResource(R.drawable.circle_3)
        }
        return view
    }

}