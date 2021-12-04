package day03

import readInput

fun List<Char>.invert(): List<Char> = map(Char::invert)

fun Char.invert(): Char = when (this) {
    '0' -> '1'
    else -> '0'
}

fun List<Char>.fromBinary(): Int = joinToString("").toInt(2)

fun gasRating(input: List<String>, invert: Boolean = false): Int {

    var lines = input

    val len = input.first().length
    for (i in (0 until len)) {
        if (lines.size == 1) break
        val counter = Counter()
        lines.forEach { counter.add(it[i]) }
        val filterChar = if (invert) counter.getMax().invert() else counter.getMax()
        lines = lines.filter { it[i] == filterChar }
    }
    return lines.first().toList().fromBinary()
}

fun main() {
    fun part1(input: List<String>): Int {
        val counters: List<Counter> = input.first().map { Counter() }
        input.forEach { it.forEachIndexed { i, c -> counters[i].add(c) } }

        val values = counters.map(Counter::getMax)

        return values.fromBinary() * values.invert().fromBinary()

    }

    fun part2(input: List<String>): Int {
        return gasRating(input) * gasRating(input, invert = true)
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    val testOutput = part2(testInput)
    check(testOutput == 230)

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}
