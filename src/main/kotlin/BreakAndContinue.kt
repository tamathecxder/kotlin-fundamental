fun main() {
    var i: Int = 0

    while(true) {
        println("Loop($i)")
        i++

        if (i > 200) {
            break
        }
    }

    for (i in 0..100) {
        if (i % 2 == 1) {
            continue
        }

        println(i);
    }
}