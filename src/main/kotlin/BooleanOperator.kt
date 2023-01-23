fun main() {
    val nilaiPraktek = 85;
    val nilaiUjian = 77;

    val afkhLulusPraktek = nilaiPraktek >= 70;
    val afkhLulusUjian = nilaiUjian >= 75;

    val dinyatakanLulus = afkhLulusPraktek && afkhLulusUjian;

    println(dinyatakanLulus);
}