package ru.maksim.twitterstrsample.presentation

import com.arellomobile.mvp.MvpView

interface AuthView : MvpView {

    fun login()

    fun showMessage(message: String)
}