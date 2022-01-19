package mainclasses

abstract class AipObject(
        val clazz: AipClass
) {

    val referenceProvider: ReferenceProvider = ReferenceProvider(HashMap())
    val references : Map<AipOjectdentifer, AipObject> = HashMap()

}