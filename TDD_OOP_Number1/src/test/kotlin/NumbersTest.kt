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
    fun test_difference() {
        val numbers: Numbers = Numbers.Base(16, 4)
        val actual = numbers.difference()
        val expected = -12
        assertEquals(expected, actual)
    }

    @Test
    fun test_multiplication() {
        val numbers: Numbers = Numbers.Base(16, 4)
        val actual = numbers.multiplication()
        val expected = 64
        assertEquals(expected, actual)
    }

    @Test
    fun test_division() {
        val numbers: Numbers = Numbers.Base(4, 16)
        val actual = numbers.division()
        val expected = 4
        assertEquals(expected, actual)
    }
}