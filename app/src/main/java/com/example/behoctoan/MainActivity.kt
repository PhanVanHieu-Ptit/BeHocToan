package com.example.behoctoan

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manhinh.setBackgroundColor(Color.GREEN)
        hinhnen.setImageResource(R.drawable.hinh_nen)

        buttoncong.setOnClickListener {
            var sothu1:Int = (edt1.text.toString()).toInt()
            var sothu2:Int = (edt2.text.toString()).toInt()
            var ketqua: Int = sothu1 + sothu2
            tvKetqua.text = ketqua.toString()
        }
        buttontru.setOnClickListener {
            var sothu1:Int = (edt1.text.toString()).toInt()
            var sothu2:Int = (edt2.text.toString()).toInt()
            var ketqua: Int = sothu1 - sothu2
            tvKetqua.text = ketqua.toString()
        }
        buttonnhan.setOnClickListener {
            var sothu1:Int = (edt1.text.toString()).toInt()
            var sothu2:Int = (edt2.text.toString()).toInt()
            var ketqua: Int = sothu1 * sothu2
            tvKetqua.text = ketqua.toString()
        }
        buttonchia.setOnClickListener {
            var sothu1:Int = (edt1.text.toString()).toInt()
            var sothu2:Int = (edt2.text.toString()).toInt()
            var ketqua: Int = sothu1 / sothu2
            tvKetqua.text = ketqua.toString()
        }
    }
}