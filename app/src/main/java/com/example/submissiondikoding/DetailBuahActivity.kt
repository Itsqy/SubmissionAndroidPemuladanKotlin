package com.example.submissiondikoding

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submissiondikoding.databinding.ActivityDetailBuahBinding

class DetailBuahActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBuahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBuahBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Buah"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_nm_buah)
        val imgSetPhoto: ImageView = findViewById(R.id.img_buah)
        val tvSetIAsal: TextView = findViewById(R.id.tv_asal_buah)
        val tvDesc: TextView = findViewById(R.id.tv_desc_buah)


        val tName = intent.getStringExtra(EXTRA_NAME)
        val image = intent.getStringExtra(EXTRA_IMG)
        val asal = intent.getStringExtra(EXTRA_ASAL)
        val desc = intent.getStringExtra(EXTRA_DESC)


        tvSetName.text = tName
        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetIAsal.text = asal
        tvDesc.text = desc


    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_ASAL = "extra_asal"
        const val EXTRA_DESC = "extra_desc"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}