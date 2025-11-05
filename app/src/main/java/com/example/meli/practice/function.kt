package com.example.meli.practice
fun show(a: Int, b: Int): Unit {    //unit is void (returns nothing) and show will show both num
    println("You entered $a and $b")
}

fun sub(a: Int, b: Int): Int {
    var subtract= 0
    subtract = a - b
    return subtract
}

fun main() {
    println("enter first number : ")
    var a: Int = readln()!!.toInt()
    println("enter second number : ")
    var b: Int = readln()!!.toInt()
    show(a, b)  //will show the nums
    var subtract = sub(a, b)
    println("a-b= $subtract")

}

