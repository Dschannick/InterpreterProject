package com.test_pack

import mainclasses.SimpleAipModule

class TestAipModule(val writer: Writer) : SimpleAipModule() {

    override fun configure() {
        objectsList.add(TestWriterObject(writer))
    }

}