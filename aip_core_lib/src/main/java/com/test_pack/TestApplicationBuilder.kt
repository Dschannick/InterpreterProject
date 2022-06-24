package com.test_pack

import mainclasses.SimpleApplication
import mainclasses.SimpleMethod

class TestApplicationBuilder(
        val writer: Writer
) {

    fun build(): SimpleApplication{
        val module = TestAipModule(writer)
        val startLogic = SimpleMethod()// TODO add proper Logic
        return SimpleApplication(module, startLogic)
    }

}