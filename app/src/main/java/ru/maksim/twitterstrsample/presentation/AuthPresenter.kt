package ru.maksim.twitterstrsample.presentation

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.maksim.twitterstrsample.model.data.server.TwitterApi
import ru.maksim.twitterstrsample.model.interactor.TwitterAuthApi
import javax.inject.Inject

@InjectViewState
class AuthPresenter @Inject constructor(
        private val twitterAuthApi : TwitterAuthApi,
        private val twitterApi: TwitterApi
) : MvpPresenter<AuthView>() {

    fun onLoginButtonPressed() {
        twitterAuthApi.authorize()
    }
}