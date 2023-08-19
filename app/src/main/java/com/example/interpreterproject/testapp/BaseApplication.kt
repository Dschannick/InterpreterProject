package com.example.interpreterproject.testapp

import android.app.Application
import com.example.interpreterproject.dagger.AppComponent

class BaseApplication : Application() {

    private var component: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }
}