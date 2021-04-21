package com.eghasp.learnphysics

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BabKelas10Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bab_kelas10)

        val btnlat_bes = findViewById(R.id.btn_lat_besaran) as Button
        val btnlat_vektor = findViewById(R.id.btn_lat_vektor) as Button
        val btnlat_gl = findViewById(R.id.btn_lat_vektor) as Button

        val btnmat_besaran = findViewById(R.id.btn_mat_besaran) as Button
        val btnmat_vektor = findViewById(R.id.btn_mat_vektor) as Button
        val btnmat_gl = findViewById(R.id.btn_mat_gl) as Button

        btnlat_bes.setOnClickListener{v: View? ->
            val intent = Intent(this,QuestionActivity::class.java)
            startActivity(intent)
        }
        btnlat_vektor.setOnClickListener{v: View? ->
            val intent = Intent(this,QuestionVektorActivity::class.java)
            startActivity(intent)
        }
        btnlat_gl.setOnClickListener{v: View? ->
            val intent = Intent(this,QuestionGLActivity::class.java)
            startActivity(intent)
        }
        btnmat_besaran.setOnClickListener{v: View? ->
            val intent = Intent(this,MateriBesaranActivity::class.java)
            startActivity(intent)
        }
        btnmat_vektor.setOnClickListener{v: View? ->
            val intent = Intent(this,MateriVektorActivity::class.java)
            startActivity(intent)
        }
        btnmat_gl.setOnClickListener{v: View? ->
            val intent = Intent(this,MateriGLActivity::class.java)
            startActivity(intent)
        }
    }
}
