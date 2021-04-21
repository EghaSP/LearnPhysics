package com.eghasp.learnphysics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_materi_besaran.*

class MateriBesaranActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_besaran)

        pdffis1_besaran.fromAsset("fis1_besaran.pdf")
                .enableSwipe(true)
                .swipeHorizontal(true)
                .onPageChange{page, pageCount -> Log.i("Log","Page: "+page.toString()+"/"+pageCount.toString())
                }
                .load()
    }
}
