package com.sotti.watch.app

import android.app.Application
import com.sotti.watch.app.di.application.ApplicationComponent
import com.sotti.watch.app.di.application.ApplicationModule
import com.sotti.watch.app.di.application.DaggerApplicationComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

internal class WatchApp : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@WatchApp)
        }
        initAppComponent()
    }

    private fun initAppComponent() {
        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    fun getApplicationComponent(): ApplicationComponent = component

}