package com.test_pack

import mainclasses.AipMethod
import mainclasses.AipObject
import mainclasses.SimpleObject


class TestWriterObject_Method1(val writer : Writer) : AipMethod() {

    override fun run(): AipObject {
        writer.write("First text of the framework")
        return SimpleObject(ArrayList(), ArrayList())
    }

}