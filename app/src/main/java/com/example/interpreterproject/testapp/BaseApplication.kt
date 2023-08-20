package com.example.interpreterproject.testapp

import android.app.Application
import com.example.interpreterproject.dagger.AndroidContextModule
import com.example.interpreterproject.dagger.AppComponent
import com.example.interpreterproject.dagger.DaggerAppComponent

class BaseApplication : Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder().androidContextModule(AndroidContextModule(this)).build()
        component.inject(this)
    }
}