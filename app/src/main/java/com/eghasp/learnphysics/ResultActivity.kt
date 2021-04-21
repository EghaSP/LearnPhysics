package com.eghasp.learnphysics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import android.content.Intent
import android.support.v4.app.ActivityCompat

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val totalQuestions = intent.getIntExtra(Constant.TOTAL_QUESTION,0)
        val correctAnswer = intent.getIntExtra(Constant.CORRECT_ANSWER,0)

        tv_score.text = "Nilai Kamu adalah $correctAnswer / $totalQuestions"

        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            ActivityCompat.finishAffinity(this)
        }
    }
}
