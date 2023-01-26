fun main() {
    fun greetings(name: String, transformer: (String) -> String): String {
        return "Hello, my name is ${transformer(name)}"
    }

    val upperTransform = { value: String -> value.uppercase() };
    val lowerTransform = { value: String -> value.lowercase() };

    println(greetings("Asep", upperTransform));
    println(greetings("Siti", lowerTransform));

    // trailing lambda call
    val trailing = greetings("Jajuli") {
        name: String -> name.uppercase();
    }

    println(trailing);
}