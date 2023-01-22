fun main() {
    var firstName: String = "Yudistira";
    var lastName: String = "Eka Pratama";
    var address: String = """
        -Cianjur,
        -Jawa Barat,
        -Indonesia
    """.trimMargin("-")

    // String concatanation
    println("$firstName $lastName. \n${address.length}");
}