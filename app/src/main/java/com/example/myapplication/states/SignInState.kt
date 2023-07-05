package com.example.myapplication.states

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)