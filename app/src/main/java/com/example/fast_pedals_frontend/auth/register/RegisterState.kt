package com.example.fast_pedals_frontend.auth.register

sealed class RegisterState {
    object Initial : RegisterState()
    object Loading : RegisterState()
    object Success : RegisterState()
    data class Error(val errorMessage: String) : RegisterState()
}
