fun main() {
    // Integer
    var age: Byte = 18;
    var countGirlfriend: Short = 4;
    var salary: Int = 11500000;
    var homePrice: Long = 2000000000L;

    // Floating Point
    var testFloat: Float = 25.96F;
    var testDouble: Double = 999.999;

    // Literals
    var decimalLiteral: Int = 23;
    var hexadecimalLiteral: Int = 0xFF;
    var binaryLiteral: Int = 0b1001010;

    // Underscore / Separator
    var btcPrice: Long = 342_709_657_20L;

    // Number Conversion
    var binaryToDouble = binaryLiteral.toDouble();
    println(binaryToDouble);
}