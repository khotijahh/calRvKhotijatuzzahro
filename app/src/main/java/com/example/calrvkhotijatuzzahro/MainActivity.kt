package com.example.calrvkhotijatuzzahro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //variabel recycler
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter:RecyclerView.Adapter<*>
    private lateinit var layoutManager:RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.listData)
        var data = ArrayList<DataGambar>()
        data.add(DataGambar(R.drawable.foto1,"20,5382", "Aditya Maulana Zada","Rpl","XII"))
        data.add(DataGambar(R.drawable.foto2,"20,5388", "Daffa Abiyyu","Rpl","XII"))
        data.add(DataGambar(R.drawable.foto3,"20,5422", "Eko Faizin","Rpl","XII"))
        data.add(DataGambar(R.drawable.foto4,"20,5393", "Ipan Aripin Ilham","Rpl","XII"))
        data.add(DataGambar(R.drawable.foto5,"20,5428", "Lutfi Maulana Azza","Rpl","XII"))
        data.add(DataGambar(R.drawable.fotoc4,"20,5384", "Alfi Naimah","Rpl","XII"))
        data.add(DataGambar(R.drawable.fotoc4,"20,5411", "Anggita Eka","Rpl","XII"))
        data.add(DataGambar(R.drawable.fotoc4,"20,5385", "Anindya Yuna","Rpl","XII"))
        data.add(DataGambar(R.drawable.fotoc4,"20,5421", "Deli Isna","Rpl","XII"))
        data.add(DataGambar(R.drawable.fotoc1,"20,5395", "Khotijatuz Zahro","Rpl","XII"))

        //menambahkan data ke dalam adapter
        recyclerAdapter = challengeAdapter(data)
        //menambahkan layout manager
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //memanggil adapter
        recyclerView.adapter = recyclerAdapter
        //menampilkan data ke adapter
        recyclerView.layoutManager = layoutManager
    }
}