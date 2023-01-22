fun main() {
    val members: Array<String> = arrayOf("Agus", "Budi", "Joko");

    println(members.size); // the length of the array

    // get an array value by its index
    println(members.get(1));
    // OR
    println(members[0]);

    // set new value to given index
    members.set(0, "John");
    // OR
    members[1] = "Asep";

    println("${members[0]} | ${members[1]}");

    /* Nullable Array */
    val managers: Array<String?> = arrayOfNulls<String>(2);
    managers[0] = "Angel";
    managers[1] = "Christine";

    println(managers[1]);
}