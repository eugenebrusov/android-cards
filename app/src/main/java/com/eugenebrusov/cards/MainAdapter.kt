package com.eugenebrusov.cards

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.item_media169_primarytext_subtext_actions_supportingtext.view.*

/**
 * Created by Eugene Brusov on 9/4/17.
 */
class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        when (viewType) {
            MEDIA_SUPPORTING_TEXT_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_media16x9_supportingtext)
            }
            AVATAR_MEDIA_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_avatar_media16x9_supportingtext_actions)
            }
            AVATAR_MEDIA_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_avatar_media16x9_actions)
            }
            MEDIA169_PRIMARYTEXT_SUBTEXT_ACTIONS_SUPPORTINGTEXT_VIEW_TYPE -> {
                return ExpandableViewHolder(parent,
                        R.layout.item_media169_primarytext_subtext_actions_supportingtext)
            }
            PRIMARYTEXT_SUBTEXT_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_primarytext_subtext_supportingtext_actions)
            }
            MEDIA169_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_media169_actions)
            }
            MEDIA11_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_media11_primarytext_subtext_actions)
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

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        /** empty implementation */
    }

    override fun getItemCount(): Int {
        return 11
    }

    override fun getItemViewType(position: Int): Int {
        when (position) {
            0 -> return MEDIA_SUPPORTING_TEXT_VIEW_TYPE
            1 -> return AVATAR_MEDIA_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE
            2 -> return AVATAR_MEDIA_ACTIONS_VIEW_TYPE
            3 -> return MEDIA169_PRIMARYTEXT_SUBTEXT_ACTIONS_SUPPORTINGTEXT_VIEW_TYPE
            4 -> return PRIMARYTEXT_SUBTEXT_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE
            5 -> return MEDIA169_ACTIONS_VIEW_TYPE
            6 -> return MEDIA11_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE
            7 -> return MEDIA1X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE
            8 -> return MEDIA15X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE
            9 -> return MEDIA2X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE
            10 -> return MEDIA3X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE
            else -> return -1
        }
    }

    companion object {
        val MEDIA_SUPPORTING_TEXT_VIEW_TYPE = 0
        val AVATAR_MEDIA_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE = 1
        val AVATAR_MEDIA_ACTIONS_VIEW_TYPE = 2
        val MEDIA169_PRIMARYTEXT_SUBTEXT_ACTIONS_SUPPORTINGTEXT_VIEW_TYPE = 3
        val PRIMARYTEXT_SUBTEXT_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE = 4
        val MEDIA169_ACTIONS_VIEW_TYPE = 5
        val MEDIA11_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE = 6
        val MEDIA1X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE = 7
        val MEDIA15X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE = 8
        val MEDIA2X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE = 9
        val MEDIA3X_PRIMARYTEXT_SUBTEXT_ACTIONS_VIEW_TYPE = 10
    }

    open class ViewHolder : RecyclerView.ViewHolder {
        constructor(parent: ViewGroup?, resId: Int) : super(LayoutInflater.from(parent?.context).inflate(resId, parent, false))
    }

    class ExpandableViewHolder : ViewHolder {
        val supportingTextView: TextView = itemView.supporting_text
        val expandButton: ImageButton = itemView.expand_button

        constructor(parent: ViewGroup?, resId: Int) : super(parent, resId) {
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