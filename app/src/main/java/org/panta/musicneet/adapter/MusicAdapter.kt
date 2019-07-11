package org.panta.musicneet.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import org.panta.musicneet.property.Music

class MusicAdapter(private val list: List<Music>) : RecyclerView.Adapter<MusicViewHolder>(){

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MusicViewHolder {

        TODO()
    }
    override fun onBindViewHolder(p0: MusicViewHolder, p1: Int) {

    }
}