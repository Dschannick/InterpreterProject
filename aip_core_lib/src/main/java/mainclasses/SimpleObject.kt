package mainclasses

open class SimpleObject : AipObject {

    constructor(methods : List<AipMethod>, references : List<AipObject>) : super(methods) {
        this.references.addAll(references);
    }

    override fun getInteger(i: Int): Int {
        return 0;
    }

    override fun getString(i: Int): String {
        return "";
    }

    override fun getBoolean(i: Int): Boolean {
        return false;
    }

    override fun getLong(i: Int): Long {
        return 0;
    }

    override fun getChar(i: Int): Char {
        return  '\u0000';
    }
}