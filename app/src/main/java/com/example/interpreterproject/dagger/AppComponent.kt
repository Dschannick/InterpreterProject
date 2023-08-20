package com.example.interpreterproject.dagger

import com.example.interpreterproject.dagger.testmodule.TestModuleA
import com.example.interpreterproject.dagger.testmodule.TestModuleB
import com.example.interpreterproject.testapp.BaseApplication
import dagger.Component


@Component(modules = [TestModuleA::class, TestModuleB::class, AndroidContextModule::class])
interface AppComponent{

    fun inject(application: BaseApplication)

}

