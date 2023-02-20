package com.example.submissiondikoding

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val url =
            "https://dicoding-web-img.sgp1.cdn.digitaloceanspaces.com/small/avatar/dos:c8abad7279febb6054af17a2c97f0d9d20230213195036.png"
        val imgprofile: ImageView = findViewById(R.id.photo_profile)
        Glide.with(this)
            .load(url)
            .apply(RequestOptions())
            .into(imgprofile)
    }
}