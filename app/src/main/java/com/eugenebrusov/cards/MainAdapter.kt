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
        when (viewType) {
            MEDIA_SUPPORTING_TEXT_VIEW_TYPE -> {
                val layout = LayoutInflater.
                        from(parent?.context).
                        inflate(R.layout.item_media_supporting_text, parent, false)
                return object : ViewHolder(layout) { /** empty implementation */ }
            }
            AVATAR_MEDIA_SUPPORTING_TEXT_ACTIONS_VIEW_TYPE -> {
                val layout = LayoutInflater.
                        from(parent?.context).
                        inflate(R.layout.item_avatar_media_supporting_text_actions, parent, false)
                return object : ViewHolder(layout) { /** empty implementation */ }
            }
            AVATAR_MEDIA_ACTIONS_VIEW_TYPE -> {
                val layout = LayoutInflater.
                        from(parent?.context).
                        inflate(R.layout.item_avatar_media_actions, parent, false)
                return object : ViewHolder(layout) { /** empty implementation */ }
            }
            else -> throw IllegalArgumentException("Inappropriate viewType")
        }
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        /** empty implementation */
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun getItemViewType(position: Int): Int {
        when (position) {
            0 -> return MEDIA_SUPPORTING_TEXT_VIEW_TYPE
            1 -> return AVATAR_MEDIA_SUPPORTING_TEXT_ACTIONS_VIEW_TYPE
            2 -> return AVATAR_MEDIA_ACTIONS_VIEW_TYPE
            else -> return -1
        }
    }

    companion object {
        val MEDIA_SUPPORTING_TEXT_VIEW_TYPE = 0
        val AVATAR_MEDIA_SUPPORTING_TEXT_ACTIONS_VIEW_TYPE = 1
        val AVATAR_MEDIA_ACTIONS_VIEW_TYPE = 2
    }
}