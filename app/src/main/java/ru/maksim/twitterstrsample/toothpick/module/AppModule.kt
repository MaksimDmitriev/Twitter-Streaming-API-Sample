package ru.maksim.twitterstrsample.toothpick.module

import android.content.Context
import ru.maksim.twitterstrsample.model.system.navigation.AppRouter
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import toothpick.config.Module

class AppModule(context: Context) : Module() {

    init {
        // Global
        bind(Context::class.java).toInstance(context)

        // Navigation
        val cicerone = Cicerone.create(AppRouter())
        bind(Router::class.java).toInstance(cicerone.router)
        bind(AppRouter::class.java).toInstance(cicerone.router)
        bind(NavigatorHolder::class.java).toInstance(cicerone.navigatorHolder)
    }

}
