package com.homeworkshop.charactergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generate()
        generateButton.setOnClickListener {
            generate()
        }

    }

    val generate = {
        val charater = CharacterGenerator.generateCharater()

        charater.run {
            nameTextView.text = name
            rankTextView.text = rank
            strongTextView.text = strong.toString()
            agetextView.text = age.toString()
        }
    }
}



