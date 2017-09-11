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
                        R.layout.item_media_supporting_text)
            }
            AVATAR_MEDIA_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_avatar_media_supporting_text_actions)
            }
            AVATAR_MEDIA_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_avatar_media_actions)
            }
            MEDIA169_PRIMARYTEXT_SUBTEXT_ACTIONS_SUPPORTINGTEXT_VIEW_TYPE -> {
                return ExpandableViewHolder(parent,
                        R.layout.item_media169_primarytext_subtext_actions_supportingtext)
            }
            PRIMARYTEXT_SUBTEXT_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE -> {
                return ViewHolder(parent,
                        R.layout.item_primarytext_subtext_supportingtext_actions)
            }
            else -> throw IllegalArgumentException("Inappropriate viewType")
        }
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        /** empty implementation */
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun getItemViewType(position: Int): Int {
        when (position) {
            0 -> return MEDIA_SUPPORTING_TEXT_VIEW_TYPE
            1 -> return AVATAR_MEDIA_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE
            2 -> return AVATAR_MEDIA_ACTIONS_VIEW_TYPE
            3 -> return MEDIA169_PRIMARYTEXT_SUBTEXT_ACTIONS_SUPPORTINGTEXT_VIEW_TYPE
            4 -> return PRIMARYTEXT_SUBTEXT_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE
            else -> return -1
        }
    }

    companion object {
        val MEDIA_SUPPORTING_TEXT_VIEW_TYPE = 0
        val AVATAR_MEDIA_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE = 1
        val AVATAR_MEDIA_ACTIONS_VIEW_TYPE = 2
        val MEDIA169_PRIMARYTEXT_SUBTEXT_ACTIONS_SUPPORTINGTEXT_VIEW_TYPE = 3
        val PRIMARYTEXT_SUBTEXT_SUPPORTINGTEXT_ACTIONS_VIEW_TYPE = 4
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