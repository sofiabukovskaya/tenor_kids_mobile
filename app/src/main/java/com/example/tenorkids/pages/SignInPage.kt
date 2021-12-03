package com.example.tenorkids.pages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tenorkids.R

class SignInPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_page)
    }

    fun toSignUp(view: View) {
        val intent = Intent(this@SignInPage, SignUpPage::class.java)
        startActivity(intent)
    }
}