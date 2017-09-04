package com.eugenebrusov.cards

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by Eugene Brusov on 9/4/17.
 */
class MainAdapter : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val layout = LayoutInflater.
                from(parent?.context).
                inflate(R.layout.item_media_supporting_text, parent, false)
        return object : ViewHolder(layout) { /** empty implementation */ }
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        /** empty implementation */
    }

    override fun getItemCount(): Int {
        return 1
    }
}