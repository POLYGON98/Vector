import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VectorShould {

    @Test
    internal fun `return string representation of 3d vector given three parameters`() {
        val vector = Vector(1, 2, 3)
        assertEquals("<1, 2, 3>", vector.toS())
    }

    @Test
    internal fun `return string representation of 3d vector given array parameter`() {
        val vector = Vector(arrayOf(1, 2, 3))
        assertEquals("<1, 2, 3>", vector.toS())
    }

    @Test
    internal fun `return array representation of 3d vector given three parameters`() {
        val vector = Vector(1, 2, 3)
        assertArrayEquals(arrayOf(1, 2, 3), vector.toA())
    }

    @Test
    internal fun `return array representation of 3d vector given array parameter`() {
        val vector = Vector(arrayOf(1, 2, 3))
        assertArrayEquals(arrayOf(1, 2, 3), vector.toA())
    }
}