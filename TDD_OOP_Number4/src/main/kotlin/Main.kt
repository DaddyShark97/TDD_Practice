import kotlin.math.abs

interface Numbers {

    fun divide(): Double

    fun isSumLong(): Boolean

    fun sumLong(): Long

    fun sumInt(): Int

    class Base(
        private val number1: Int,
        private val number2: Int
    ) : Numbers {

        private var wasSumLongCalled = false
        private var wasSumLong = false

        override fun isSumLong(): Boolean {
            wasSumLongCalled = true



            val limit = if (number1 > 0 && number2 > 0) // ++
                Int.MAX_VALUE
            else // +- -+ --
                abs( Int.MIN_VALUE)
            val rest = limit - abs(number1)

            val result = abs(number2) > rest
            wasSumLong = result
            return result
        }

        override fun sumLong(): Long {
            if (wasSumLongCalled) {
                if (wasSumLong)
                    return number1.toLong() + number2
                throw IllegalAccessException("you shouldn't use this method: sumLong")
            }
            throw IllegalAccessException("first you should check the sum by method isSumLong")
        }

        override fun sumInt(): Int {
            if (wasSumLongCalled) {
                if (wasSumLong)
                    throw IllegalAccessException("you shouldn't use this method: sumInt")
                return number1 + number2
            }
            throw IllegalAccessException("first you should check the sum by method isSumLong")
        }

        override fun divide(): Double {
            if (number1 == 0)
                throw IllegalArgumentException("can't divide by zero")
            return number2.toDouble() / number1
        }
    }
}