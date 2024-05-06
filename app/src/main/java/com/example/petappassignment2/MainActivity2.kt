package com.example.petappassignment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge

class MainActivity2 : AppCompatActivity() {
    //declare
    private lateinit var imageView: ImageView
    private lateinit var Feedbutton: Button
    private lateinit var CleanButton: Button
    private lateinit var PlayButton: Button
    private lateinit var Feedbar: ProgressBar
    private lateinit var Cleanbar: ProgressBar
    private lateinit var Playbar: ProgressBar

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //initialize
        imageView = findViewById(R.id.imageView2)
        Feedbutton = findViewById(R.id.feedbutton)
        CleanButton = findViewById(R.id.cleanbutton)
        PlayButton = findViewById(R.id.playbutton)
        Feedbar = findViewById(R.id.progressBar)
        Cleanbar = findViewById(R.id.progressBar2)
        Playbar = findViewById(R.id.progressBar3)

        //increase the progressbar by 50

        Feedbutton.setOnClickListener {
            imageView.setImageResource(R.drawable.img_2)
            Feedbar.incrementProgressBy(20)
        }
        CleanButton.setOnClickListener {
            imageView.setImageResource(R.drawable.img_1)
            Cleanbar.incrementProgressBy(20)
        }
        PlayButton.setOnClickListener {
            imageView.setImageResource(R.drawable.img_3)
            Playbar.incrementProgressBy(20)
        }
    }
}