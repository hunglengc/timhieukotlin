package tet

fun main(){
    println("number 1: ")
    val x = readLine()?.toInt()
    println("number 2: ")
    val y = readLine()?.toInt()

    var result = 1
    var i =0
    while(x != null && y != null && i < y){
        result *= x
        i++
    }
println("$x to power of $y is $result")
}