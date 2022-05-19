package com.mansao.motogpriderss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mansao.motogpriderss.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val list: ArrayList<Riders> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list.addAll(RidersData.listData)

        showRiders()
    }

    private fun showRiders() {
        binding.apply {
            rvRiders.layoutManager = LinearLayoutManager(this@MainActivity)
            val listRidersAdapter = ListRidersAdapter(list)
            rvRiders.adapter = listRidersAdapter

            listRidersAdapter.setItemClickCallBack(object : ListRidersAdapter.OnItemClickCallBack{
                override fun onItemClicked(data: Riders) {
                    showSelectedItem(data)
                }
            })
        }
    }

    private fun showSelectedItem(data: Riders) {
        val intentToDetailActivity = Intent(this, DetailActivity::class.java)
        intentToDetailActivity.putExtra(DetailActivity.EXTRA_DATA, data)
        startActivity(intentToDetailActivity)
    }
}