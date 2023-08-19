package com.example.interpreterproject.testapp

import android.app.Application
import com.example.interpreterproject.dagger.GlobalComponent

class BaseApplication : Application() {

    private var component: GlobalComponent? = null

    override fun onCreate() {
        super.onCreate()
        component = Dagger
    }
}