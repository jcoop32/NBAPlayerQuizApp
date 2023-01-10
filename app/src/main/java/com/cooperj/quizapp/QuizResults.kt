package com.cooperj.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class QuizResults : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val tvName: TextView = findViewById(R.id.tvUserName)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnFinish: Button = findViewById(R.id.btnFinish)
        val tvStatus: TextView = findViewById(R.id.tvStatus)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"

        when (correctAnswers) {
            in 0..5 -> {
                tvStatus.text = "NBA Knowledge Level: Nonexistent"
            }
            in 6..19 -> {
                tvStatus.text = "NBA Knowledge Level: Casual"
            }
            in 20..35 -> {
                tvStatus.text = "NBA Knowledge Level: You watch a little basketball"
            }
            in 36..40 -> {
                tvStatus.text = "NBA Knowledge Level: Expert"
            }
            else -> {
                tvStatus.text = "NBA Knowledge Level: G.O.A.T."
            }
        }

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}