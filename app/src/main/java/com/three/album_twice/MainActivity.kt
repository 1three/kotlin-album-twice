package com.three.album_twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var isDouble = false
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

    // 뒤로 가기 버튼 이벤트
    override fun onBackPressed() {
        Toast.makeText(this, "뒤로 가기를 두 번 누르면 앱이 종료됩니다.", Toast.LENGTH_LONG).show()

        // 더블 클릭 시, 앱 종료
        if (isDouble == true) {
            finish()
        }

        isDouble = true

        // 2초 후에 isDouble 변수를 false로 설정 (다시 더블 클릭하여 종료하도록 구성)
        Handler().postDelayed({
            isDouble = false
        }, 2000)

    }
}