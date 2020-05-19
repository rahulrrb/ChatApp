package com.rrb.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginLoginBtnClicked(view: View) {
        val createUserIntent = Intent(this, CreateUserAvtivity::class.java)
        startActivity(createUserIntent)
    }

    fun loginCreateUserBtnClicked(view: View) {

    }
}
