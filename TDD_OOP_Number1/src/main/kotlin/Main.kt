interface Numbers {

    fun sum(): Int
    fun difference(): Int
    fun multiplication(): Int
    fun division(): Int

    class Base(
        private val number1: Int,
        private val number2: Int
    ) : Numbers {


        override fun sum(): Int {
            return number2 + number1
        }

        override fun difference(): Int {
            return number2 - number1
        }

        override fun multiplication(): Int {
            return number2 * number1
        }

        override fun division(): Int {
            return  number2 / number1
        }
    }
}