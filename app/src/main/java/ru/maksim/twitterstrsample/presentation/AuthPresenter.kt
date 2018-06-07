package ru.maksim.twitterstrsample.presentation

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.maksim.twitterstrsample.model.system.navigation.AppRouter
import javax.inject.Inject

@InjectViewState
class AuthPresenter @Inject constructor(
        router: AppRouter
) : MvpPresenter<AuthView>() {

    fun onLoginButtonPressed() {

    }
}