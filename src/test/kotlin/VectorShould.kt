import org.junit.jupiter.api.Assertions.*
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

    @Test
    internal fun `return z value`() {
        assertEquals(3, vectorA.getZ())
    }

    @Test
    internal fun `return true if vectors are equal`() {
        assertTrue(vectorA == vectorB)
    }

    @Test
    internal fun `add two vectors together`() {
        val sum = Vector(2, 4, 6)
        assertEquals(sum, vectorA + vectorB)
    }

    @Test
    internal fun `subtract one vector from another`() {
        val difference = Vector(0, 0, 0)
        assertEquals(difference, vectorA - vectorB)
    }

    @Test
    internal fun `calculate magnitude of a vector`() {
        assertEquals(3.74, vectorA.magnitude(), 0.01)
    }

    @Test
    internal fun `calculate dot product of 2 vectors`() {
        assertEquals(14, vectorA.dot(vectorB))
    }

    @Test
    internal fun `calculate cross product of two vectors`() {
        val result = Vector(0,0,0)
        assertEquals(result, vectorA.cross(vectorB))
    }
}