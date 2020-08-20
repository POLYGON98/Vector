import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class VectorShould {
    private lateinit var vectorA: Vector
    private lateinit var vectorB: Vector

    @BeforeEach
    internal fun setUp() {
        vectorA = Vector(1, 2, 3)
        vectorB = Vector(arrayOf(1, 2, 3))
    }

    @Test
    internal fun `return string representation of 3d vector given three parameters`() {
        assertEquals("<1, 2, 3>", vectorA.toS())
    }

    @Test
    internal fun `return string representation of 3d vector given array parameter`() {
        assertEquals("<1, 2, 3>", vectorB.toS())
    }

    @Test
    internal fun `return array representation of 3d vector given three parameters`() {
        assertArrayEquals(arrayOf(1, 2, 3), vectorA.toA())
    }

    @Test
    internal fun `return array representation of 3d vector given array parameter`() {
        assertArrayEquals(arrayOf(1, 2, 3), vectorB.toA())
    }

    @Test
    internal fun `return x value`() {
        assertEquals(1, vectorA.getX())
    }

    @Test
    internal fun `return y value`() {
        assertEquals(2, vectorA.getY())
    }
}