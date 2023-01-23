fun tertidur(nama: String, afkhNgorok: Boolean, waktu: String? = "Malam") {
    var suaraNgorok: String = "";
    if (afkhNgorok) {
        suaraNgorok = "KRRrKKRRRRRrrr";
    } else {
        suaraNgorok = "zzzzzzzzzz";
    }

    println("$nama tertidur $suaraNgorok pada waktu $waktu");
}

fun main() {
    tertidur("John", true);
}