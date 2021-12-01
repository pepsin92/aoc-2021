package day01

import readInput

fun main() {

    fun <T : Comparable<T>> List<T>.risingCount(): Int = windowed(2).count { it.first() < it.last() }

    fun part1(input: List<String>): Int {
        return input.map { it.toInt() }.risingCount()
    }

    fun part2(input: List<String>): Int {
        return input.map { it.toInt() }.windowed(3).map { it.sum() }.risingCount()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
