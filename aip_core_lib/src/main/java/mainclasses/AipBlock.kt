package mainclasses

interface AipBlock {

    val parameters : List<AipOjectdentifer>

  //  val provider : ReferenceProvider

    fun run(provider : ReferenceProvider)

}