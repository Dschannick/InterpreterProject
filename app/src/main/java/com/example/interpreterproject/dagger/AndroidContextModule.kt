package com.example.interpreterproject.dagger

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AndroidContextModule(private val ctx: Application) {

    @Provides
    fun provideApplicationContext(): Context? {
        return ctx
    }

    @Provides
    fun provideApplication(): Application? {
        return ctx
    }
}

