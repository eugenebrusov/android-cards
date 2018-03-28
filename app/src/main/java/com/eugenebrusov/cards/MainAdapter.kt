package com.eugenebrusov.cards

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Space
import android.widget.TextView
import kotlinx.android.synthetic.main.item_media16x9_primarytext_subtext_actions_supportingtext.view.*

/**
 * Created by Eugene Brusov on 9/4/17.
 */
class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        when (viewType) {
            MEDIA16x9_SUPPORTINGTEXT_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_media16x9_supportingtext)
            }
            AVATAR_MEDIA16x9_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_avatar_media16x9_supportingtext_actions)
            }
            AVATAR_MEDIA16x9_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_avatar_media16x9_actions)
            }
            MEDIA16x9_PRIMARYTEXT_SUBTEXT_ACTIONS_SUPPORTINGTEXT_VIEW_TYPE -> {
                return ExpandableViewHolder(parent,
                        R.layout.item_media16x9_primarytext_subtext_actions_supportingtext)
            }
            PRIMARYTEXT_SUBTEXT_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_primarytext_subtext_supportingtext_actions)
            }
            MEDIA16x9_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_media16x9_actions)
            }
            MEDIA1x1_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_media1x1_primarytext_subtext_actions)
            }
            MEDIA1X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_media1x_primarytext_subtext_actions)
            }
            MEDIA15X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_media15x_primarytext_subtext_actions)
            }
            MEDIA2X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_media2x_primarytext_subtext_actions)
            }
            MEDIA3X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_media3x_actions)
            }
            else -> throw IllegalArgumentException("Inappropriate viewType")
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        /** empty implementation */
    }

    override fun getItemCount(): Int {
        return 11
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> MEDIA16x9_SUPPORTINGTEXT_VIEW_TYPE
            1 -> AVATAR_MEDIA16x9_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE
            2 -> AVATAR_MEDIA16x9_ACTIONS_VIEW_TYPE
            3 -> MEDIA16x9_PRIMARYTEXT_SUBTEXT_ACTIONS_SUPPORTINGTEXT_VIEW_TYPE
            4 -> PRIMARYTEXT_SUBTEXT_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE
            5 -> MEDIA16x9_ACTIONS_VIEW_TYPE
            6 -> MEDIA1x1_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE
            7 -> MEDIA1X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE
            8 -> MEDIA15X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE
            9 -> MEDIA2X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE
            10 -> MEDIA3X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE
            else -> -1
        }
    }

    companion object {
        const val MEDIA16x9_SUPPORTINGTEXT_VIEW_TYPE = 0
        const val AVATAR_MEDIA16x9_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE = 1
        const val AVATAR_MEDIA16x9_ACTIONS_VIEW_TYPE = 2
        const val MEDIA16x9_PRIMARYTEXT_SUBTEXT_ACTIONS_SUPPORTINGTEXT_VIEW_TYPE = 3
        const val PRIMARYTEXT_SUBTEXT_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE = 4
        const val MEDIA16x9_ACTIONS_VIEW_TYPE = 5
        const val MEDIA1x1_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE = 6
        const val MEDIA1X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE = 7
        const val MEDIA15X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE = 8
        const val MEDIA2X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE = 9
        const val MEDIA3X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE = 10
    }

    open class ViewHolder(parent: ViewGroup?, resId: Int)
        : RecyclerView.ViewHolder(LayoutInflater.from(parent?.context).inflate(resId, parent, false))

    class ExpandableViewHolder(parent: ViewGroup?, resId: Int) : ViewHolder(parent, resId) {
        private val supportingTextView: TextView = itemView.supporting_text
        private val expandButton: ImageButton = itemView.expand_button

        init {
            expandButton.setOnClickListener {
                if (supportingTextView.visibility == View.VISIBLE) {
                    expandButton.setImageResource(R.drawable.ic_expand_less_black_36dp)
                    supportingTextView.visibility = View.GONE
                } else {
                    expandButton.setImageResource(R.drawable.ic_expand_more_black_36dp)
                    supportingTextView.visibility = View.VISIBLE
                }
            }
        }

    }
}