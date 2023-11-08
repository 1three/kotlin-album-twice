package com.three.album_twice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // 화면 보이기
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // 1. MainActivity에서 전달한 사진 번호 가져오기
        val imgNumber = intent.getIntExtra("imgNumber", 1)

        // 2. 선택한 사진의 리소스 id 가져오기 (실제 파일명)
        val resourceId = resources.getIdentifier("member_$imgNumber", "drawable", packageName)

        // 3. imgView에 선택한 사진 설정하기
        val imgView = findViewById<ImageView>(R.id.detailImgView)
        imgView.setImageResource(resourceId)
    }
}