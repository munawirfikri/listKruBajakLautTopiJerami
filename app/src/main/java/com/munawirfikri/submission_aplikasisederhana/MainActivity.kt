package com.munawirfikri.submission_aplikasisederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvCrew: RecyclerView
    private var list: ArrayList<Crew> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val about : LinearLayout = findViewById(R.id.about)

        about.setOnClickListener(this)

        rvCrew = findViewById(R.id.rv_crew)
        rvCrew.setHasFixedSize(true)
        list.addAll(CrewData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvCrew.layoutManager = LinearLayoutManager(this)
        val listCrewAdapter = ListCrewAdapter(list)
        rvCrew.adapter = listCrewAdapter

        listCrewAdapter.setOnItemClickCallback(object : ListCrewAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Crew) {
                showSelectedCrew(data)
            }
        })
    }

    private fun showSelectedCrew(crew: Crew) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_NAME, crew.name)
        intent.putExtra(DetailActivity.EXTRA_JAPAN_NAME, crew.japaneseName)
        intent.putExtra(DetailActivity.EXTRA_DESCRIPTION, crew.detail)
        intent.putExtra(DetailActivity.EXTRA_ORDER, crew.order)
        intent.putExtra(DetailActivity.EXTRA_BOUNTY, crew.photoBounty)
        startActivity(intent)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}