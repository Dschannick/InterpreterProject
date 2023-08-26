package com.test_pack

import mainclasses.AipObject
import mainclasses.SimpleAipModule
import mainclasses.SimpleObject

class TestAipModule(val writer: Writer) : SimpleAipModule() {

    override fun configure(): AipObject {
        val rootObject = SimpleObject(ArrayList(), ArrayList())
        rootObject.references.add(TestWriterObject(writer))
        return rootObject;
    }

}