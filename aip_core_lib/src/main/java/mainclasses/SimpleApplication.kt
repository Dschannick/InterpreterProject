package mainclasses

import com.example.rte.RteApplication

open class SimpleApplication(
        val aipModule: AipModule
) : AipObject(AipClass()), RteApplication {

    override fun start() {
        aipModule.configure()
        aipModule.getObjects()[0].clazz.methods[0].run(aipModule.getObjects()[0].referenceProvider)
    }

}