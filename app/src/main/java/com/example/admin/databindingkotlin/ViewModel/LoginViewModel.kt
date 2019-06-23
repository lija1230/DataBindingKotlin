package com.example.admin.databindingkotlin.ViewModel

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.admin.databindingkotlin.`interface`.LoginResultCallbacks
import com.example.admin.databindingkotlin.model.User

class LoginViewModel(private val listener: LoginResultCallbacks) : ViewModel() {

    private val user: User

    init {
        this.user = User("", "")
    }

    val emailTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                user.setEmail(s.toString())
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        }

    val passwordTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                user.setPassword(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        }

    fun onLoginClicked(v: View)
    {
        if(user.isDataValid){
            listener.OnSucess("login Success")
        }
        else
        {
            listener.OnError("Login Error")
        }
    }
}