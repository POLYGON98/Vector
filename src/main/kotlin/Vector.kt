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

}
