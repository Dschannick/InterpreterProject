package mainclasses

abstract class SimpleAipModule : AipModule {

    val objectsList : MutableList<AipObject> = ArrayList()

    abstract override fun configure()

    /*
    override fun getNamedObjects(): Set<Pair<String, Int>> {
        val set : Set<Pair<String, Int>> = HashSet()

        return set
    }
     */

    override fun getObjects(): List<AipObject> {
        return objectsList
    }
}