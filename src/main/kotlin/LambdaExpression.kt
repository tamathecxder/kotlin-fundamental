fun lower(value: String): String = value.lowercase();

fun main() {
    // Lambda in variable
    val lambdaName: (String, Int) -> String = {
        value: String, age: Int ->
        val person = "$value, ${age.toString()} years old.";
        person;
    }

    // it parameter
    val yourHobby: (String) -> String = {
        it.uppercase()
    }

    // method reference
    val petName: (String) -> String = ::lower

    val name = lambdaName("Jane", 20);
    val hobby = yourHobby("3D Modeling");
    val pet = petName("ASEP");

    println(name);
    println(hobby);
    println(pet);
}