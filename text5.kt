package tet

fun main(){
    println("Please enter a number")
    var x = readLine()?.toInt()
    println("Lets count from $x down to 0: ")

    while(x != null && x != 0){
        println(x)
        x--
    }
}