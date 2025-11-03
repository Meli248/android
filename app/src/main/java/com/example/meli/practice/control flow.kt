package com.example.meli.practice
fun main() {
    //if else
    print("enter your age: ")
    val age: Int = readln()!!.toInt()

    if (age >= 18) {
        println("$age can vote")
    } else {
        println("$age cant vote")
    }
    //If-Else-If
    print("Please enter your age: ")
    val yourAge: Int = readln()!!.toInt()

    if (yourAge < 15) {
        println("You are a middle schooler")
    } else if (yourAge < 19) {
        println("You are a highschooler")
    } else if (yourAge < 50) {
        println("You are an adult")
    } else {
        println("You are a senior")
    }
}