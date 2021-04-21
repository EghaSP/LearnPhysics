package com.eghasp.learnphysics

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    //lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

       // handler = Handler()
       // handler.postDelayed({

       //     val intent = Intent(this, MainActivity::class.java)
       //     startActivity(intent)
       //     finish()
       // }, 3000)

        welcome.alpha = 0f
        welcome.animate().setDuration(3000).alpha(1f).withEndAction{
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}
