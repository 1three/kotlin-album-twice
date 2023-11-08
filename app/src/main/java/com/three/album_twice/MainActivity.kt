package com.three.album_twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // 화면 보이기
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 요소 클릭
        for(i in 1..9) {
            val resourceId = resources.getIdentifier("twice_img_$i", "id", packageName)
            println(resourceId)
            val imgView = findViewById<ImageView>(resourceId)
            imgView.setOnClickListener {
                // 2. 요소 클릭 시, 다음 화면 전환 및 확대된 사진 보이기
                val intent = Intent(this, DetailActivity::class.java)
                intent.putExtra("imgNumber", i)
                startActivity(intent)
            }
        }
    }
}