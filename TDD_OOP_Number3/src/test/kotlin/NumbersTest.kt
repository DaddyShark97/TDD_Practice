import org.junit.Assert.*
import org.junit.Test

class NumbersTest {

    @Test
    fun test_sum_long() {
        val numbers: Numbers = Numbers.Base(2_000_000_000, 147483648)
        val isSumLong = numbers.isSumLong()
        val expected = true
        assertEquals(expected, isSumLong)
        val actual: Long = numbers.sumLong()
        val expectedNumber: Long = Int.MAX_VALUE + 1L
        assertEquals(expectedNumber, actual)
    }

    @Test
    fun test_sum_Int() {
        val numbers: Numbers = Numbers.Base(2_000_000_000, 147483647)
        val isSumLong = numbers.isSumLong()
        val expected = false
        assertEquals(expected, isSumLong)
        val actual: Int = numbers.sumInt()
        val expectedNumber: Int = Int.MAX_VALUE
        assertEquals(expectedNumber, actual)
    }

    @Test(expected = IllegalAccessException::class)
    fun test_sum_int_no_check() {
        val numbers: Numbers = Numbers.Base(2_000_000_000, 2_000_000_000)
        numbers.sumInt()
    }

    @Test(expected = IllegalAccessException::class)
    fun test_sum_long_no_check() {
        val numbers: Numbers = Numbers.Base(2_000_000_000, 2_000_000_000)
        numbers.sumLong()
    }

    @Test(expected = IllegalAccessException::class)
    fun test_sum_long_called_for_long_sum() {
        val numbers: Numbers = Numbers.Base(2_000_000_000, 2_000_000_000)
        val actual = numbers.isSumLong()
        val expected = true
        assertEquals(expected, actual)
        numbers.sumInt()
    }

    @Test(expected = IllegalAccessException::class)
    fun test_sum_long_called_for_int_sum() {
        val numbers: Numbers = Numbers.Base(2_000_000_000, 2_000_000_000)
        val actual = numbers.isSumLong()
        val expected = false
        assertEquals(expected, actual)
        numbers.sumLong()
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