package tet

import java.lang.Double.sum

fun main(){
    val array = arrayOf(11,5,9,3,20,6)
    var sum = 0
    for (i in array){
        sum += i
    }
    println("$sum")
}