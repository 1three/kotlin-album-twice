# kotlin-album-twice
[Kotlin] Twice 사진을 볼 수 있는 `안드로이드` 앨범 앱

![album-twice](https://github.com/1three/kotlin-album-twice/assets/94810322/167345c5-ee62-4881-9933-47c3704c176b)

<br>

## 📖 배운 점

#### 📄 둥근 모서리 만들기

안드로이드에서는 `CardView`의 `app:cardCornerRadius`를 통해 둥근 모서리를 만들 수 있다.

```xml
<androidx.cardview.widget.CardView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:cardCornerRadius="10dp"
    android:layout_marginVertical="10dp">
    <ImageView
        android:id="@+id/twice_img_1"
        android:scaleType="center"
        android:src="@drawable/member_1"
        android:layout_width="120dp"
        android:layout_height="120dp" />
</androidx.cardview.widget.CardView>
```

<br>

#### 📄 뒤로 가기 버튼 이벤트

안드로이드에서는 `onBackPressed()`를 통해 뒤로 가기 버튼에 대한 이벤트를 적용할 수 있다.

```Kotlin
private var isDouble = false

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
```
