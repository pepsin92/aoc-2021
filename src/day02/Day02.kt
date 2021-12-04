package day02

import readInput

fun main() {

    fun part1(input: List<String>): Int {
        val submarine = Submarine()
        input.map { it.split(' ') }.forEach { submarine.handleCommand(it[0], it[1]) }
        return submarine.score
    }

    fun part2(input: List<String>): Int {
        val submarine = AimedSubmarine()
        input.map { it.split(' ') }.forEach { submarine.handleCommand(it[0], it[1]) }
        return submarine.score
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
