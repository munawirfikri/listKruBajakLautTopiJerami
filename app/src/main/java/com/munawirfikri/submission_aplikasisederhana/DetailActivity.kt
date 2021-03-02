package com.munawirfikri.submission_aplikasisederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_JAPAN_NAME = "extra_japan_name"
        const val EXTRA_DESCRIPTION = "extra_desc"
        const val EXTRA_ORDER = "extra_order"
        const val EXTRA_BOUNTY = "extra_bounty"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName : TextView = findViewById(R.id.tv_detail_name)
        val tvJapanName : TextView = findViewById(R.id.tv_detail_name_japan)
        val tvDesc : TextView = findViewById(R.id.tv_detail_deskripsi)
        val tvOrder : TextView = findViewById(R.id.tv_detail_urutan)
        val imgBounty : ImageView = findViewById(R.id.img_detail_photo)
        val goBack : LinearLayout = findViewById(R.id.navigation)

        val name = intent.getStringExtra(EXTRA_NAME)
        val japaneseName = intent.getStringExtra(EXTRA_JAPAN_NAME)
        val desc = intent.getStringExtra(EXTRA_DESCRIPTION)
        val order = intent.getStringExtra(EXTRA_ORDER)
        val bounty = intent.getIntExtra(EXTRA_BOUNTY, 0)

        tvName.text = name
        tvJapanName.text = japaneseName
        tvDesc.text = desc
        tvOrder.text = order
        Glide.with(this)
            .load(bounty)
            .apply(RequestOptions().override(200, 300))
            .into(imgBounty)

        goBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.navigation -> {
                val intent = Intent(this@DetailActivity,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}