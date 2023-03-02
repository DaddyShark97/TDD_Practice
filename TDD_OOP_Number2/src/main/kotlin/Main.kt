interface Numbers{

    fun sum(): Int

    fun divide(): Double

    class Base(
        private val number1: Int,
        private val number2: Int
    ) : Numbers {

        override fun sum(): Int {
            return number2 + number1
        }

        override fun divide(): Double {
            if (number1 == 0)
                throw IllegalArgumentException("can't divide by zero")
            return  number2.toDouble() / number1
        }
    }
}