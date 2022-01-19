package com.test_pack

import mainclasses.SimpleApplication

class TestApplicationBuilder(
        val writer: Writer
) {

    fun build(): SimpleApplication{
        val module = TestAipModule(writer)
        return SimpleApplication(module)
    }

// module.getObjects()[0].clazz.methods[0]
}