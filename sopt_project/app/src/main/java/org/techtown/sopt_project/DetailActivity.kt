package org.techtown.sopt_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        this.detail_title.text = intent.getStringExtra("title")
        this.detail_subtitle.text = intent.getStringExtra("subTitle")
        this.detail_date.text = intent.getStringExtra("date")
        this.detail_detail.text = intent.getStringExtra("detail")
    }
}
