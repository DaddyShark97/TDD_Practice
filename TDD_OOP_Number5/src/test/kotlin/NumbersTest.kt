import org.junit.Assert.*
import org.junit.Test

class NumbersTest {

    @Test
    fun test_sum_int_different_signs() {
        val numbers: Numbers = Numbers.Base(200, -300)
        val isSumLong = numbers.isSumLong()
        val expected = false
        assertEquals(expected, isSumLong)
        val actual = numbers.sumInt()
        val expectedNumber = -100
        assertEquals(expectedNumber, actual)
    }

    @Test
    fun test_sum_long_max() {
        val numbers: Numbers = Numbers.Base(2_000_000_000, 147483648)
        val isSumLong = numbers.isSumLong()
        val expected = true
        assertEquals(expected, isSumLong)
        val actual: Long = numbers.sumLong()
        val expectedNumber: Long = Int.MAX_VALUE + 1L
        assertEquals(expectedNumber, actual)
    }

    @Test
    fun test_sum_Int_max() {
        val numbers: Numbers = Numbers.Base(2_000_000_000, 147483647)
        val isSumLong = numbers.isSumLong()
        val expected = false
        assertEquals(expected, isSumLong)
        val actual: Int = numbers.sumInt()
        val expectedNumber: Int = Int.MAX_VALUE
        assertEquals(expectedNumber, actual)
    }

    @Test
    fun test_sum_long_min() {
        val numbers: Numbers = Numbers.Base(-2_000_000_000, -147483649)
        val isSumLong = numbers.isSumLong()
        val expected = true
        assertEquals(expected, isSumLong)
        val actual: Long = numbers.sumLong()
        val expectedNumber: Long = Int.MIN_VALUE - 1L
        assertEquals(expectedNumber, actual)
    }

    @Test
    fun test_sum_int_min() {
        val numbers: Numbers = Numbers.Base(-2_000_000_000, -147483648)
        val isSumLong = numbers.isSumLong()
        val expected = false
        assertEquals(expected, isSumLong)
        val actual: Int = numbers.sumInt()
        val expectedNumber: Int = Int.MIN_VALUE
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

    @Test
    fun test_difference() {
        val numbers: Numbers = Numbers.Base(16, 4)
        val actual = numbers.difference()
        val expected = -12
        assertEquals(expected, actual)
    }

}