fun String.hello(): String {
    return "Hello $this";
}

fun main() {
    val person: String = "Jamal";
    val hello: String = person.hello();

    println(hello);
}