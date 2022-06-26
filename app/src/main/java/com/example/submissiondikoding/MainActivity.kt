package com.example.submissiondikoding

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBuah: RecyclerView
    private var list: ArrayList<Buah> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title = "Fruit"

        rvBuah = findViewById(R.id.rv_buah)
        rvBuah.setHasFixedSize(true)
        list.addAll(BuahData.listData)

        recyclerView()

    }

    private fun recyclerView() {
        rvBuah.layoutManager = LinearLayoutManager(this)
        val academyAdapter = BuahAdapter(list)
        rvBuah.adapter = academyAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
                val iAbout = Intent(
                    this@MainActivity,
                    ProfileActivity::class.java
                )
                startActivity(iAbout)
            }
        }
    }


}