package com.mansao.motogpriderss

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mansao.motogpriderss.databinding.ItemRowRiderBinding

class ListRidersAdapter(private val listRiders: ArrayList<Riders>) :
    RecyclerView.Adapter<ListRidersAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallBack: OnItemClickCallBack

    fun setItemClickCallBack(onItemClickCallBack: OnItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val binding =
            ItemRowRiderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val riders = listRiders[position]
        Glide.with(holder.itemView.context)
            .load(riders.image)
            .centerCrop()
            .into(holder.binding.imgItemPhoto)

        holder.binding.tvItemName.text = riders.name
        holder.binding.tvItemDesc.text = riders.desc

        holder.itemView.setOnClickListener {
            onItemClickCallBack.onItemClicked(listRiders[holder.adapterPosition])

        }
    }

    override fun getItemCount(): Int = listRiders.size

    class ListViewHolder(val binding: ItemRowRiderBinding) : RecyclerView.ViewHolder(binding.root)

    interface OnItemClickCallBack {
        fun onItemClicked(data: Riders)
    }
}
