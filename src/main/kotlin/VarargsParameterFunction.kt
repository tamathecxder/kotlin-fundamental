fun finalValue(name: String, vararg values: Int) {
    var total = 0.0;
    for (value in values) {
        total += value;
    }

    println("Nilai ujian $name adalah $total");
}

fun main() {
    finalValue("Asep", 75,62,81,95,77);
}