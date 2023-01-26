fun main() {
    fun factorialLoop(num: Int): Int {
        var result = 1;
        for (i in num downTo 1) {
            result *= i;
        }

        return result;
    }

    fun factorialRecursive(num: Int): Int {
//        return if (num == 1) {
//            return 1;
//        } else {
//            return num * factorialRecursive(num - 1);
//        }

        return when(num) {
            1 -> 1
            else -> num * factorialRecursive(num - 1);
        }
    }

    var test1 = factorialLoop(5);
    println(test1);

    var test2 = factorialRecursive(4);
    println(test2);
}