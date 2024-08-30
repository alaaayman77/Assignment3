package com.example.assignment3

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class PostsActivity : AppCompatActivity() {
    lateinit var settingsRecyclerView: RecyclerView
    lateinit var adapter: Adapter
    lateinit var postList: MutableList<PostItem>
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts)
        settingsRecyclerView = findViewById(R.id.posts_recycler_view)
        postList = mutableListOf()
        createList()
        adapter = Adapter(postList)

        settingsRecyclerView.adapter=adapter

    }
    fun createList() {
        postList = ArrayList<PostItem>()

        for (i in 0..99) {
            postList.add(
                PostItem(
                    title= "unblast"+i,

                )
            )
        }
    }
}