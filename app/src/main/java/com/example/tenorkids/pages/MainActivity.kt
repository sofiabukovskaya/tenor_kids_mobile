package com.example.tenorkids.pages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tenorkids.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openAboutUs(view: View) {
        val intent = Intent(this@MainActivity, AboutUsPage::class.java)
        startActivity(intent)
    }
    fun openSignUp(view: View) {
        val intent = Intent(this@MainActivity, SignUpPage::class.java)
        startActivity(intent)
    }

    fun openSignIn(view: View) {
        val intent = Intent(this@MainActivity, SignInPage::class.java)
        startActivity(intent)
    }
}