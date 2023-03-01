import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumbersTest {

    @Test
    fun test_sum() {
        val numbers: Numbers = Numbers.Base(16, 4)
        val actual = numbers.sum()
        val expected = 20
        assertEquals(expected, actual)
    }

    @Test
    fun test_divide() {
        val numbers: Numbers = Numbers.Base(4, 10)
        val actual = numbers.divide()
        val expected = 2.5
        assertEquals(expected, actual)
    }

    @Test
    fun test_divide_zero() {
        val numbers: Numbers = Numbers.Base(0, 10)
        val actual = numbers.divide()
        val expected = Infinity
        assertEquals(expected, actual, 0.0)
    }
}