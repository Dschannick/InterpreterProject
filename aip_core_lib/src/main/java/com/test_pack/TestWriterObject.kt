package com.test_pack

import mainclasses.SimpleObject

class TestWriterObject : SimpleObject{

    constructor(writer: Writer) : super(listOf(TestWriterObject_Method1(writer)), ArrayList()) {

    }

}