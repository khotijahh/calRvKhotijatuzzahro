package com.example.calrvkhotijatuzzahro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class challengeAdapter (private val dataSet:ArrayList<DataGambar>):
    RecyclerView.Adapter<challengeAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val gambar: ImageView = view.findViewById(R.id.imageView)
        val Nis: TextView = view.findViewById(R.id.Nis)
        val Nama: TextView = view.findViewById(R.id.Nama)
        val Jurusan: TextView = view.findViewById(R.id.Jurusan)
        val Kelas: TextView = view.findViewById(R.id.Kelas)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val inflate = LayoutInflater.from(parent.context)
           .inflate(R.layout.activity_challenge_adapter,parent,false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val DataGambar = dataSet[position]
        holder.gambar.setImageResource(DataGambar.gambar)
        holder.Nis.text = DataGambar.Nis
        holder.Nama.text = DataGambar.Nama
        holder.Jurusan.text = DataGambar.Jurusan
        holder.Kelas.text = DataGambar.Kelas
    }

    override fun getItemCount(): Int {
        return  dataSet.size
    }
}





