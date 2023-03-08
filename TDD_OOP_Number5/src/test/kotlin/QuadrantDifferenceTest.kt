import org.junit.Assert.*
import org.junit.Test

class QuadrantDifferenceTest {

    @Test
    fun test_long() {
        val numbers = FakeNumbers.Base(true)
        val quadrantDifference = QuadrantDifference.Base(numbers)
        val actual: Long = quadrantDifference.value()
        val expected:Long = 10
        assertEquals(true, numbers.differenceCalled())
        assertEquals(true, numbers.isSumLongCalled())
        assertEquals(true, numbers.sumLongCalled())
        assertEquals(false, numbers.sumIntCalled())
        assertEquals(expected, actual)
    }

    @Test
    fun test_int() {
        val numbers = FakeNumbers.Base(false)
        val quadrantDifference = QuadrantDifference.Base(numbers)
        val actual: Long = quadrantDifference.value()
        val expected:Long = 6
        assertEquals(true, numbers.differenceCalled())
        assertEquals(true, numbers.isSumLongCalled())
        assertEquals(false, numbers.sumLongCalled())
        assertEquals(true, numbers.sumIntCalled())
        assertEquals(expected, actual)
    }

    @Test
    fun test() {
        val quadrantDifference = QuadrantDifference.Base(Numbers.Base(5, 3))
        val actual = quadrantDifference.value()
        val expected = 16L
        assertEquals(actual, expected)
    }

    private interface FakeNumbers : Numbers {

        fun differenceCalled() :Boolean
        fun sumIntCalled() :Boolean
        fun sumLongCalled() :Boolean
        fun isSumLongCalled() :Boolean

    class Base(private val isSumLong:Boolean) : FakeNumbers {

        private var differenceCalled = false
        private var sumIntCalled = false
        private var sumLongCalled = false
        private var isSumLongCalled = false

        override fun differenceCalled(): Boolean {
            return differenceCalled
        }

        override fun sumIntCalled(): Boolean {
            return sumIntCalled
        }

        override fun sumLongCalled(): Boolean {
            return sumLongCalled
        }

        override fun isSumLongCalled(): Boolean {
            return isSumLongCalled
        }

        override fun difference(): Int {
            differenceCalled = true
            return 2
        }

        override fun divide(): Double {
            TODO("Not yet implemented")
        }

        override fun isSumLong(): Boolean {
            isSumLongCalled = true
            return isSumLong
        }

        override fun sumLong(): Long {
            sumLongCalled = true
            return 5L
        }

        override fun sumInt(): Int {
            sumIntCalled = true
            return 3
        }
      }
    }
}