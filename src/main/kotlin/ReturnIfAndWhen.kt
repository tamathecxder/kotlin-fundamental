fun main() {
    fun sayHello(name: String? = ""): String {
        return if (name == "" || name == null) {
            "Hello, Masbro";
        } else {
            "Hello, $name";
        }
    }

    var isLoading: Boolean = true;

    fun showLoadingIndicator(loading: Boolean): String {
        return when (loading) {
            true -> "Loading...";
            false -> "(app is running)";
        }
    }

    val result = sayHello();
    println(result);

    val load: String = showLoadingIndicator(isLoading);
    println(load);
}