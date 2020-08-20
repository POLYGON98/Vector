class Vector(private val x: Int, private val y: Int, private val z: Int) {
    fun toS(): String {
        return "<$x, $y, $z>"
    }

    fun toA(): Array<Int> {
        return arrayOf(x, y, z)
    }

}
