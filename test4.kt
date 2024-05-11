package tet

fun main() {
    println("your age is")
    val age = readLine()?.toInt()
    if (age != null) {
        if (age <= 18) {
            println("you are too young")
        } else if (age >= 18 && age <= 60) {
            println("you are a adult yet")
        } else {
            println("you are old")
        }

    }
}
