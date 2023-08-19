package com.example.interpreterproject.dagger

import dagger.Component


@Component(modules = [TestModuleA::class, TestModuleB::class])
class GlobalComponent {

}