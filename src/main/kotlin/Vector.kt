import kotlin.math.sqrt

class Vector {
    private var x: Int = 0
    private var y: Int = 0
    private var z: Int = 0

    constructor(x: Int, y: Int, z: Int) {
        this.x = x
        this.y = y
        this.z = z
    }
    constructor(input: Array<Int>) {
        x = input[0]
        y = input[1]
        z = input[2]
    }

    fun toS(): String {
        return "<$x, $y, $z>"
    }

    fun toA(): Array<Int> {
        return arrayOf(x, y, z)
    }

    fun getX(): Int {
        return x
    }

    fun getY(): Int {
        return y
    }

    fun getZ(): Int {
        return z
    }

    override fun equals(other: Any?): Boolean {
        val rhs = other as Vector
        return (this.x == rhs.getX() && this.y == rhs.getY() && this.z == rhs.getZ())
    }

    operator fun plus(addend: Vector): Vector {
        return Vector(this.x + addend.getX(), this.y + addend.getY(), this.z + addend.getZ())
    }

    operator fun minus(subtrahend: Vector): Vector {
        return Vector(this.x - subtrahend.getX(), this.y - subtrahend.getY(), this.z - subtrahend.getZ())
    }

    fun magnitude(): Double {
        return sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z).toDouble())
    }

    fun dot(other: Vector): Int {
        return (this.x * other.getX()) + (this.y * other.getY()) + (this.z * other.getZ())
    }
}
