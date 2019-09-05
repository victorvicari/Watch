package com.sotti.watch.app.di.application

import com.sotti.watch.app.MainActivity
import com.sotti.watch.app.di.view_model.ViewModelModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

}