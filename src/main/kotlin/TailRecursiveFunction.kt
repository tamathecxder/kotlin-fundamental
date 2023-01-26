fun main() {
     tailrec fun display(num: Int): Unit {
         println("Tailrec ($num)");

         if (num > 0) {
             display(num - 1);
         }
     }

    tailrec fun tailFactorial(value: Int, total: Int = 1): Int {
        return when(value) {
            1 -> total;
            else -> tailFactorial(value - 1, total * value);
        }
    }

//    display(10000);

    val test = tailFactorial(5);
    println(test);
}