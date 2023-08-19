package com.example.interpreterproject.dagger

import dagger.Module

@Module(includes = [TestModuleA::class, TestModuleB::class])
class EveryThingModule {

}