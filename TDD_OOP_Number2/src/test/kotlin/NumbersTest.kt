import org.junit.Assert.*
import org.junit.Test


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
        assertEquals(expected, actual, 0.0001)
    }

    @Test(expected = IllegalArgumentException::class)
    fun test_divide_zero() {
        val numbers: Numbers = Numbers.Base(0, 10)
        numbers.divide()
    }
}