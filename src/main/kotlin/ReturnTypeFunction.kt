fun sum(x: Int, y: Int): Int {
    return x + y;
}

fun pyramid(num: Int) {
    for (i in 1..num) {
        for (j in 1..num - i){
            print(" ");
        }

        for (j in 1 until 2*i) {
            print("*")
        }

        println()
    }

}

fun main() {
    val example: Int = sum(5,5);
    val testPyramid = pyramid(5);

//    println(example);
    println(testPyramid);
}
