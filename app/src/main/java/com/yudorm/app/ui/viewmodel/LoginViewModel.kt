package com.yudorm.app.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue



class LoginViewModel : ViewModel() {

    var studentNo by mutableStateOf("")
    var password by mutableStateOf("")
    var message by mutableStateOf("")


    fun login(){
        if (studentNo == "20211603001" && password == "123") {
            message = "Giriş Başarılı!"

        } else {
            message = "Giriş başarısız! Şifre veya kullanıcı adı hatalı"
        }
    }
}