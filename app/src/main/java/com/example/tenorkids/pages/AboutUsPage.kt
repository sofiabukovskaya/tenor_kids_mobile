package com.example.tenorkids.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ShareCompat
import com.example.tenorkids.R

class AboutUsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us_page)
    }

    fun contactAction(view: View) {
        ShareCompat.IntentBuilder.from(this)
            .setType("message/rfc822")
            .addEmailTo("sofiia.bykovska@nure.ua")
            .setSubject("Improvement suggestion, feedback or question")
            .setText("")
            .startChooser();
    }
}