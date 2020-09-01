package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var correctCount: Int = 0;
    private var point: Int = 1;
    private var maxPoints: Int = 4;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            onSubmitClick()
        }
    }

    private fun onSubmitClick(){
        checkAnswer1()
        checkAnswer2()
        checkAnswer3()
        checkAnswer4()
        correctMessage()
        correctCount = 0;
    }

    private fun checkAnswer1(){
        val answer1 = binding.answer1.text.toString()
        if(answer1 == getString(R.string.trueStat)){
            correctCount = correctCount+point
        }
    }
    private fun checkAnswer2(){
        val answer2 = binding.answer2.text.toString()
        if(answer2 == getString(R.string.falseStat)){
            correctCount = correctCount+point
        }
    }
    private fun checkAnswer3(){
        val answer3 = binding.answer3.text.toString()
        if(answer3 == getString(R.string.falseStat)){
            correctCount = correctCount+point
        }
    }
    private fun checkAnswer4(){
        val answer4 = binding.answer4.text.toString()
        if(answer4 == getString(R.string.falseStat)){
            correctCount = correctCount+point
        }
    }
    
    private fun correctMessage(){
        Toast.makeText(this, getString(R.string.message, correctCount), Toast.LENGTH_SHORT).show()
    }

}