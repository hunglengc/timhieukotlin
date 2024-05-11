fun main() {
    val x = 7
    val y = 7
    val z = if(x+y==14) 3 else 4

    if(x < y)
        println("x is lesser than y")
    else if(x > y)
        println("x is greater than y")
    else
        println("x is equal to y")

    println("the value is $z")
}
