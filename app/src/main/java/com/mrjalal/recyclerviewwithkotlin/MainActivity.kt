package com.mrjalal.recyclerviewwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView = findViewById(R.id.rv_images)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)

        val mockData:ArrayList<ImageInfo> = getMockData()
        val adapter = CustomAdapter(mockData)
        recyclerView.adapter = adapter
    }

    fun getMockData():ArrayList<ImageInfo>{
        val tmpList:ArrayList<ImageInfo> = arrayListOf()
        tmpList.add(ImageInfo("https://4-starpetcare.com/wp-content/uploads/2012/09/rabbit23_a.jpg", "image 1"))
        tmpList.add(ImageInfo("https://www.hagebau.de/3fc0251723f82ea1363e7f19f6466d08/assets/binaryImages/13_hagebau%20web/14935_Wilde-Kaninchen-Header-web.jpg", "image 2"))
        tmpList.add(ImageInfo("http://mediafiles.allaboutwindowsphone.com/images/lumiablack/berres-tb.jpg", "image 3"))
        tmpList.add(ImageInfo("https://www.wpclipart.com/animals/primates/baboon/baboon_face.png", "image 4"))
        tmpList.add(ImageInfo("https://www.hagebau.de/3fc0251723f82ea1363e7f19f6466d08/assets/binaryImages/13_hagebau%20web/14935_Wilde-Kaninchen-Header-web.jpg", "image 5"))
        tmpList.add(ImageInfo("https://4-starpetcare.com/wp-content/uploads/2012/09/rabbit23_a.jpg", "image 6"))
        tmpList.add(ImageInfo("https://cloud.netlifyusercontent.com/assets/344dbf88-fdf9-42bb-adb4-46f01eedd629/68dd54ca-60cf-4ef7-898b-26d7cbe48ec7/10-dithering-opt.jpg", "image 7"))
        return tmpList
    }
}
