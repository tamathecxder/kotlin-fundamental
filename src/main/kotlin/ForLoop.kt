fun main() {
    val hobbies = arrayOf("Code", "Produce Music", "Design")
    for (hobby in hobbies) {
        println(hobby)
    }

    val exampleRange = 0..100;

    for (value in exampleRange) {
        print("$value, ")
    }

    for (value in 10 downTo 1 step 2) {
        println(value)
    }

    val arr: Array<String> = arrayOf("Indonesia", "Singapore", "Malaysia", "Filipino", "Thailand");
    val size = arr.size - 1;
    for (i in 0..size) {
        println("Index($i) = ${arr[i]}")
    }
}