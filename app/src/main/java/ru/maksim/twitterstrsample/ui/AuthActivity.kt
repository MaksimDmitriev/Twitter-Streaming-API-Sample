package ru.maksim.twitterstrsample.ui

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import ru.maksim.twitterstrsample.R
import ru.maksim.twitterstrsample.model.interactor.TwitterAuthApiUi
import ru.maksim.twitterstrsample.presentation.AuthPresenter
import ru.maksim.twitterstrsample.presentation.AuthView
import ru.maksim.twitterstrsample.toothpick.module.DI
import toothpick.Toothpick

class AuthActivity : MvpAppCompatActivity(), AuthView, TwitterAuthApiUi {

    override fun login() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showMessage(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @InjectPresenter
    lateinit var presenter: AuthPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @ProvidePresenter
    fun providePresenter(): AuthPresenter {
        val scope = Toothpick.openScope(DI.APP_SCOPE)
        return scope.getInstance(AuthPresenter::class.java)
    }
}
