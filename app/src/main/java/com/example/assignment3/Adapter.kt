package com.example.assignment3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Adapter(val postList : List<PostItem>) : RecyclerView.Adapter<Adapter.PostsItemViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsItemViewHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.getContext());
        val view: View = inflater.inflate(R.layout.post_item , parent , false);
        return PostsItemViewHolder(view);

    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostsItemViewHolder, position: Int) {
        val item : PostItem = postList.get(position)
        holder.title.text= item.title




    }

    class PostsItemViewHolder(view : View) : ViewHolder(view){
        val title : TextView = view.findViewById(R.id.post_title)

    }
}