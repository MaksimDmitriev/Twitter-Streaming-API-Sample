package ru.maksim.twitterstrsample.model.interactor

import android.app.Activity
import com.twitter.sdk.android.core.Callback
import com.twitter.sdk.android.core.TwitterSession
import com.twitter.sdk.android.core.identity.TwitterAuthClient
import javax.inject.Inject

class TwitterAuthApi @Inject constructor(
        private val twitterAuthClient: TwitterAuthClient,
        private val twitterAuthApiUi: TwitterAuthApiUi,
        private val twitterSessionCallback : Callback<TwitterSession>
) {

    // TODO: Inject to the method rather than class? Is it OK when using DI?
    fun authorize() {
        twitterAuthClient.authorize(
                twitterAuthApiUi as Activity,
                twitterSessionCallback
        )
    }

}