package ru.maksim.twitterstrsample

import android.app.Application
import android.content.res.Configuration
import ru.maksim.twitterstrsample.toothpick.module.AppModule
import toothpick.Toothpick
import toothpick.registries.FactoryRegistryLocator
import toothpick.registries.MemberInjectorRegistryLocator

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initToothpick()
        initAppScope()
    }

    private fun initToothpick() {
        Toothpick.setConfiguration(Configuration.forProduction().disableReflection())
        MemberInjectorRegistryLocator.setRootRegistry(
                ru.maksim.twitterstrsample.MemberInjectorRegistry()
        )
        FactoryRegistryLocator.setRootRegistry(
                ru.maksim.twitterstrsample.FactoryRegistry()
        )
    }

    private fun initAppScope() {
        val appScope = initToothpick()
        appScope.installModules(AppModule(this))
    }
}
