package day03

class Counter : HashMap<Char, Int>() {

    fun add(value: Char) {
        this[value] = this[value]?.plus(1) ?: 0
    }

    fun getMax(): Char = if (this['1']!! >= this['0']!!) '1' else '0'

    override fun toString(): String {
        return "<Counter ${super.toString()}>"
    }
}
