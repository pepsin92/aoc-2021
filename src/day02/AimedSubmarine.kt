package day02

class AimedSubmarine : Submarine() {
    var aim: Int = 0

    override fun forward(value: Int) {
        super.forward(value)
        depth += value * aim
    }

    override fun down(value: Int) {
        aim += value
    }

    override fun up(value: Int) = down(-value)
}
