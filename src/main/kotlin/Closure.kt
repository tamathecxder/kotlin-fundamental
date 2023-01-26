fun main() {
    var number = 0;

    fun functionIncrement() {
        number++
        println("Increment the number")
    }

    val lambdaIncrement: () -> Unit = {
        number++
        println("Increment the number")
    }

    val anonymousIncrement = fun(): Unit {
        number++
        println("Increment the number")
    }

    functionIncrement()
    anonymousIncrement()
    lambdaIncrement()
    anonymousIncrement()
    lambdaIncrement()

    print(number)
}