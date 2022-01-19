package com.example.rte

/**
 * Runtime environment
 * This class is the entry into the framework
 */
open class Rte {

    fun run(application: RteApplication){
        application.start()
    }

}