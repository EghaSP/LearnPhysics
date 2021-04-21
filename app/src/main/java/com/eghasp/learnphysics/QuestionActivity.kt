package com.eghasp.learnphysics

import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.AdaptiveIconDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_question.*
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import android.content.Intent

class QuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Questions>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        mQuestionsList = Constant.getQuestions()
        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    private fun setQuestion() {

        val questions = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            btn_submit.text = "SELESAI"
        }else{
            btn_submit.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        tv_question.text = questions!!.question
        iv_image.setImageResource(questions.image)
        tv_option_one.text = questions.optionOne
        tv_option_two.text = questions.optionTw0
        tv_option_three.text = questions.optionThree
        tv_option_four.text = questions.optionFour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#3C93C3"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                    this, R.drawable.optionbtn)
        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one ->{
                selectedOptionView(tv_option_one, 1)
            }
            R.id.tv_option_two ->{
                selectedOptionView(tv_option_two, 2)
            }
            R.id.tv_option_three ->{
                selectedOptionView(tv_option_three, 3)
            }
            R.id.tv_option_four ->{
                selectedOptionView(tv_option_four, 4)
            }
            R.id.btn_submit ->{
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(Constant.CORRECT_ANSWER, mCorrectAnswers)
                        intent.putExtra(Constant.TOTAL_QUESTION, mQuestionsList!!.size)
                        startActivity(intent)
                        finish()
                        //Toast.makeText(this, "LATIHAN TELAH SELESAI!", Toast.LENGTH_SHORT).show()
                        //finish()
                        }
                    }
                }else{
                    val questions = mQuestionsList?.get(mCurrentPosition -1)
                    if (questions!!.correctAns != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrongoption)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(questions.correctAns, R.drawable.correctoption)

                    if (mCurrentPosition == mQuestionsList!!.size){
                        btn_submit.text = "SELESAI"
                    }else{
                        btn_submit.text = "SOAL SELANJUTNYA"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        when (answer){
            1 ->{
                tv_option_one.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 ->{
                tv_option_two.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 ->{
                tv_option_three.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 ->{
                tv_option_four.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun selectedOptionView (tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#ffffff"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
                this, R.drawable.optionsubmit)
    }
}