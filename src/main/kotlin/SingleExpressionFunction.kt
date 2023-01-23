fun kenalanSingkat(name: String): Unit = println("Hi, $name");
fun reverse(text: String): String = text.reversed().lowercase()

fun main() {
    kenalanSingkat("Putri");
    val result: String = reverse("Agus");
    println(result);
}