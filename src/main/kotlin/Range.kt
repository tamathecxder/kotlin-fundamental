fun main() {
    val range = 0..100;

    println(range.count()); // total data pada range
    println(range.contains(50)); // cek value yang ada pada range
    println(range.first);
    println(range.last);
    println(range.step);

    // reversed range
    val anotherRange = 50 downTo 1;
    println(anotherRange);

    // range with step
    val stepRange = 1..10 step 2;
    println(stepRange);
}