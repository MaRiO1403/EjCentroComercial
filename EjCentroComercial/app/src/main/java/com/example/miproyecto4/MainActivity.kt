package com.example.miproyecto4

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    companion object {
        var mediaPlayer: MediaPlayer? = null
        var isMusicPlaying = false
        var currentMusicPosition = 0
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(this, R.raw.coconut_mall)
            mediaPlayer?.isLooping = true
        }

        if (!isMusicPlaying) {
            mediaPlayer?.seekTo(currentMusicPosition)
            mediaPlayer?.start()
            isMusicPlaying = true
        }

        findViewById<CardView>(R.id.cardCentro1).setOnClickListener {
            navigateToTienda()
        }
        findViewById<CardView>(R.id.cardCentro2).setOnClickListener {
            navigateToTienda()
        }
        findViewById<CardView>(R.id.cardCentro3).setOnClickListener {
            navigateToTienda()
        }
        findViewById<CardView>(R.id.cardCentro4).setOnClickListener {
            navigateToTienda()
        }
    }

    private fun navigateToTienda() {
        val intent = Intent(this, Tienda::class.java)
        startActivity(intent)
    }

    override fun onPause() {
        super.onPause()
        if (!isChangingConfigurations) {
            currentMusicPosition = mediaPlayer?.currentPosition ?: 0
            mediaPlayer?.pause()
            isMusicPlaying = false
        }
    }

    override fun onResume() {
        super.onResume()
        if (!isMusicPlaying) {
            mediaPlayer?.seekTo(currentMusicPosition)
            mediaPlayer?.start()
            isMusicPlaying = true
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (!isChangingConfigurations) {
            mediaPlayer?.release()
            mediaPlayer = null
            currentMusicPosition = 0
            isMusicPlaying = false
        }
    }
}
