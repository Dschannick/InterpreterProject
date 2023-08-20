package com.example.interpreterproject.dagger

import com.example.interpreterproject.dagger.testmodule.TestModuleA
import com.example.interpreterproject.dagger.testmodule.TestModuleB
import dagger.Module

@Module(includes = [TestModuleA::class, TestModuleB::class])
class EveryThingModule {

}