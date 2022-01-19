package mainclasses

interface AipModule {

    fun configure()

  //  fun getNamedObjects() : Set<Pair<String, Int>> //TODO move to wapper

    fun getObjects() : List<AipObject>

}