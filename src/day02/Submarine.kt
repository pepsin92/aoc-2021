package day02

open class Submarine(var position: Int = 0, var depth: Int = 0) {
    open fun forward(value: Int) {
        position += value
    }

    open fun down(value: Int) {
        depth += value
    }

    open fun up(value: Int) = down(-value)

    fun handleCommand(command: String, value: String) {
        val intValue = value.toInt()
        when (command) {
            "forward" -> forward(intValue)
            "down" -> down(intValue)
            "up" -> up(intValue)
        }
    }

    val score: Int
        get() = position * depth
}
