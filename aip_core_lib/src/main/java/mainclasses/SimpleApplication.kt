package mainclasses

import com.example.rte.RteApplication

open class SimpleApplication(
        val aipModule: AipModule,
        val startLogic: AipMethod
) : RteApplication {

    override fun start() {
        val rootObject = aipModule.configure()
        startLogic.run()
    }

}