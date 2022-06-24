package mainclasses

abstract class AipObject(val methods : List<AipMethod>) {

    val references : MutableList<AipObject> = ArrayList()

    abstract fun getInteger(i: Int): Int

    abstract fun getString(i: Int): String

    abstract fun getBoolean(i: Int): Boolean

    abstract fun getLong(i: Int): Long

    abstract fun getChar(i: Int): Char

}