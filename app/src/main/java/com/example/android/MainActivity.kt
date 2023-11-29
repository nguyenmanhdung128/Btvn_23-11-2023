package com.example.android

import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)

        var list : ArrayList<Message> = ArrayList<Message>()

        list.add(Message("Anh Hưng", "Nhóm 2", "6:00 PM"))
        list.add(Message("Chị Mai", "chị gái iiii", "4:50 PM"))
        list.add(Message("Mẹ", "mẹ", "3:10 PM"))
        list.add(Message("Ông ngoại", "ông ngoại", "1:40 PM"))
        list.add(Message("Bố", "bố", "1:20 PM"))
        list.add(Message("em Vinh", "Nhóm 7", "8:03 AM"))
        list.add(Message("Hoàng", "Bạn cùng lớp", "8:00 AM"))
        list.add(Message("Huy Minh Vũ", "bạn ktx", "9:00 AM"))
        list.add(Message("em Hoa", "nhóm 8", "8:40 AM"))
        list.add(Message("Lan Anh", "Bạn đại học", "8:30 AM"))
        list.add(Message("Bà Ngoại", "bà ngoại", "8:23 AM"))
        list.add(Message("Mẹ", "Mẹ", "8:15 AM"))
        list.add(Message("Xe khách QN", "chuyến 11h30 sáng", "8:07 AM"))
        list.add(Message("Minh Dũng", "IT1 02", "7:49 AM"))
        list.add(Message("Shipper", "shoppe", "7:10 AM"))
        list.add(Message("Mẹ", "mẹ", "6:03 AM"))
        list.add(Message("Chị Mai", "chị gái", "6:00 AM"))


        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = Adapter(list)
    }
}

