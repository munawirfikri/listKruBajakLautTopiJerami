package com.munawirfikri.submission_aplikasisederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class AboutActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val back : LinearLayout = findViewById(R.id.back_navigation)

        back.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.back_navigation -> {
                val intent = Intent(this@AboutActivity,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}