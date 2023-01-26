fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val value = transformer(name);
        return value;
    }

    val lower = fun(value: String): String {
        if (value.isEmpty()) {
            return "You have 1 required argument to fill";
        }

        return value.lowercase();
    }

    println(lower(""));
    
}