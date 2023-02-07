package com.example.foodrunner

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class loginActivity : AppCompatActivity() {
    lateinit var etPhoneNo:EditText
    lateinit var etPasscode:EditText
    lateinit var btnLogin:Button
    lateinit var txtForgotPassword:TextView
    lateinit var txtRegister:TextView
    val validMobileNo = arrayOf("7974635183" , "9109495516" , "9630380199" )
    val validPassword = arrayOf("797463" , "910949" , "963038" )

    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.login_activity)
        title = "Login"

        etPhoneNo = findViewById(R.id.edit_text_name)
        etPasscode = findViewById(R.id.edit_text_password)
        btnLogin = findViewById(R.id.login)
        txtForgotPassword = findViewById(R.id.forgotpassword)
        txtRegister = findViewById(R.id.signup)



        btnLogin.setOnClickListener {
            val mobilenumber = etPhoneNo.text.toString()
            val passcode = etPasscode.text.toString()
            if (validMobileNo.contains(mobilenumber) && validPassword.contains(passcode)) {
                val intent = Intent(this@loginActivity , HomePageActivity::class.java)
                startActivity(intent)

                Toast.makeText( this@loginActivity ,"Logging In " , Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText( this@loginActivity ," Incorrect Credentials  " , Toast.LENGTH_SHORT).show()
            }
        }



    }


    fun SignUp(view: View) {
        val intent = Intent(this@loginActivity , registerActivity::class.java)
        startActivity(intent)
    }

    fun ResetPassword(view: View) {
        val intent = Intent(this@loginActivity , forgotPassword::class.java)
        startActivity(intent)
    }

    override fun onPause() {
        super.onPause()
        finish()
    }








}
