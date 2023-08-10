package com.example.bobmukjaku

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bobmukjaku.Model.WrapperInChatRoomMenu
import com.example.bobmukjaku.databinding.ChatMenuRoomInfoBinding
import com.example.bobmukjaku.databinding.ChatMenuRoomParticipantsListBinding

class ChatMenuParticipantsAdapter(var participants: ArrayList<WrapperInChatRoomMenu>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class MenuInfoViewHolder(itemView: ChatMenuRoomInfoBinding): RecyclerView.ViewHolder(itemView.root){
        fun bind(position: Int){

        }
    }

    inner class ParticipantsListViewHolder(itemView: ChatMenuRoomParticipantsListBinding): RecyclerView.ViewHolder(itemView.root){
        fun bind(position: Int){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            1->{
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.chat_menu_room_info, parent, false)
                return MenuInfoViewHolder(ChatMenuRoomInfoBinding.bind(view))
            }
            else->{
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.chat_menu_room_participants_list, parent, false)
                return ParticipantsListViewHolder(ChatMenuRoomParticipantsListBinding.bind(view))
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return participants[position].menuType
    }

    override fun getItemCount(): Int {
        return participants.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(participants[position].menuType){
            1->{
                (holder as MenuInfoViewHolder).bind(position)
            }
            else->{
                (holder as ParticipantsListViewHolder).bind(position)
            }
        }
    }


}