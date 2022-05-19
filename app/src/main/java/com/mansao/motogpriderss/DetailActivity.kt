package com.mansao.motogpriderss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.mansao.motogpriderss.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataRiders = intent.getParcelableExtra<Riders>(EXTRA_DATA)
        supportActionBar?.title = dataRiders?.name
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.apply {
            Glide.with(this@DetailActivity)
                .load(dataRiders?.image)
                .centerCrop()
                .into(imgPhoto)

            tvName.text = dataRiders?.name
            tvDec.text = dataRiders?.desc
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    companion object {
        const val EXTRA_DATA = "extra_data"
    }
}