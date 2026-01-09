package com.tomildev.compose_samples.views.textFields.basic_login

import android.util.Patterns
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.util.regex.Matcher

class BasicLoginViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(LoginModel())
    val uiState: StateFlow<LoginModel> = _uiState.asStateFlow()

    fun onEmailChanged(email: String) {

        _uiState.update { currentState ->
            currentState.copy(
                email = email
            )
        }
    }

    fun onPasswordChanged(password: String) {

        _uiState.update { currentState ->
            currentState.copy(
                password = password
            )
        }
    }

    fun doLogin(){

//        if (validEmail){
//
//        }

    }

    private fun validEmail(email: String): Boolean = Patterns.EMAIL_ADDRESS.matcher(email).matches()
    private fun validPassword(password: String): Boolean = password.length >= 8


    data class LoginModel(
        val email: String = "",
        val password: String = "",
        val isLogged: Boolean = false
    )
}