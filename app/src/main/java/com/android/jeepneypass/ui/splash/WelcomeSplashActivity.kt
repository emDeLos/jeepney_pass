package com.android.jeepneypass.ui.splash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.android.jeepneypass.databinding.ActivityWelcomeSplashBinding
import com.android.jeepneypass.ui.login.LoginActivity

@SuppressLint("CustomSplashScreen")
class WelcomeSplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeSplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        runLoadingProgress()
        Handler(Looper.getMainLooper()).postDelayed({goToLogin()}, 5500)
    }

    private fun runLoadingProgress() {
        var i = binding.pbLoading.progress
        Thread(Runnable {
            while (i < 100) {
                i += 1
                Handler(Looper.getMainLooper()).post(Runnable {
                    binding.pbLoading.progress = i
                    binding.tvLoading.text = if (i % 3 == 0) {
                        "Loading.\n${i}%"
                    } else if (i % 3 == 1) {
                        "Loading..\n${i}%"
                    } else {
                        "Loading...\n${i}%"
                    }
                })
                try {
                    Thread.sleep(50)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }).start()
    }

    private fun goToLogin() {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}