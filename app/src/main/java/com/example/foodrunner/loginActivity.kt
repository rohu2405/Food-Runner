package com.example.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)


    }


    fun SignUp(view: View) {
        val intent = Intent(this@loginActivity , registerActivity::class.java)
        startActivity(intent)
    }

    fun ResetPassword(view: View) {
        val intent = Intent(this@loginActivity , forgotPassword::class.java)
        startActivity(intent)
    }
}