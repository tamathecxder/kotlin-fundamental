fun main() {
    val rupiahCurrency: Double = 11.000;

    when(rupiahCurrency) {
        10.000, 11.000, 12.000 -> println("Safe")
        13.000 -> println("Little Bit Safe")
        15.000 -> println("Warning")
        20.000 -> println("Danger!")
        else -> {
            println("Unpredictable")
            println("Be safe")
        }
    }

    val myFinalExam: String = "A";
    val passValue: Array<String> = arrayOf("A", "B", "C");

    when (myFinalExam) {
        in passValue -> println("Pass");
        !in passValue -> println("Try again in next exam");
    }

    val name = "Ashly";
    when(name) {
        is String -> println("The value is a String");
        !is String -> println("The value is not a String");
    }

    val nilaiPraktek = 22;

    when {
        nilaiPraktek >= 75 -> println("Good Job");
        nilaiPraktek < 74 -> println("Not Bad");
        else -> println("Goblok");
    }
}