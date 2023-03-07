package com.example.mygrowth

import android.app.Application
import com.example.mygrowth.di.MainActivityViewModelModule.viewModelModule
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class MyGrowthApplication : Application(), KoinComponent {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(listOf(
                viewModelModule
            ))
        }
    }
}