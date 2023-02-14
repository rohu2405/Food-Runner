package com.example.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class HomePageActivity : AppCompatActivity() {

    lateinit var layoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        title = " Home "

        val myDataSet = DataSource().loadProduct()
        val recyclerView: RecyclerView = findViewById(R.id.recycler)

        recyclerView.adapter = ItemAdapter(this , myDataSet)
        recyclerView.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)

        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context , (layoutManager as LinearLayoutManager).orientation
            )
        )


    }
}

//DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
//layoutManager.getOrientation());
//recyclerView.addItemDecoration(dividerItemDecoration);