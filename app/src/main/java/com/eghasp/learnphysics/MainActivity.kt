package com.eghasp.learnphysics

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.support.v7.widget.LinearLayoutManager
//import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declare animation
        val toptobottom = AnimationUtils.loadAnimation(this,R.anim.toptobottom);
        val bottomtotop = AnimationUtils.loadAnimation(this,R.anim.bottomtotop);

        val headertitle = findViewById(R.id.textView) as TextView
        val kamu = findViewById(R.id.kamu) as TextView
        val btn10 = findViewById(R.id.button10) as ImageButton
        val btn11 = findViewById(R.id.button11) as ImageButton
        val btn12 = findViewById(R.id.button12) as ImageButton

        //set animation
        headertitle.startAnimation(toptobottom)
        kamu.startAnimation(toptobottom)
        btn10.startAnimation(bottomtotop)
        btn11.startAnimation(bottomtotop)
        btn12.startAnimation(bottomtotop)

        btn10.setOnClickListener{v: View? ->
            val intent = Intent(this,BabKelas10Activity::class.java)
            startActivity(intent)
        }

        btn12.setOnClickListener{v: View? ->
            val intent = Intent(this,QuestionActivity::class.java)
            startActivity(intent)
        }

    }

}
