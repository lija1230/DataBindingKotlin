package com.example.admin.databindingkotlin.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.admin.databindingkotlin.`interface`.LoginResultCallbacks

class LoginModelFactory (private val listener: LoginResultCallbacks): ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(listener) as T
    }
}