interface Numbers {

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
            return  number2.toDouble() / number1
        }
    }
}