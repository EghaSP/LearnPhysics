package com.eghasp.learnphysics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_materi_vektor.*

class MateriVektorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_vektor)

        pdffis1_vektor.fromAsset("fis1_vektor.pdf")
                .enableSwipe(true)
                .swipeHorizontal(true)
                .onPageChange{page, pageCount -> Log.i("Log","Page: "+page.toString()+"/"+pageCount.toString())
                }
                .load()
    }
}
