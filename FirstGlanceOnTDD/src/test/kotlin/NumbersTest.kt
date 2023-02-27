import org.junit.Assert.*
import org.junit.Test

class NumbersTest {

    @Test
    fun `test min`() {
        val numbers = Numbers.Base(first = 3, second = 155)
        val actual:Int = numbers.minimum()
        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun `test max`() {
        val numbers = Numbers.Base(first = -10, second = 64)
        val actual:Int = numbers.maximum()
        val expected = 64
        assertEquals(expected, actual)
    }

    @Test
    fun `test list`() {
        val numbers:Numbers = Numbers.List(list = listOf(5, 3, 2, -22, 432))
        val minimum: Int = numbers.minimum()
        val maximum: Int = numbers.maximum()
        assertEquals(-22, minimum)
        assertEquals(432, maximum)
    }
}