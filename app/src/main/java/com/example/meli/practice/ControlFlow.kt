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
    print("enter your age: ")
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


    //nested loop
    println("enter 3 num")
    var num1:Int =readln()!!.toInt()
    var num2:Int =readln()!!.toInt()
    var num3:Int =readln()!!.toInt()
    var smallest:Int
        if (num1 < num2) {
            if (num1 < num3) {
                smallest = num1
            } else {
                smallest = num3
            }
        } else {
            if (num2 < num3) {
                smallest = num2
            } else {
                smallest = num3
            }
        }
        println("smallest number is $smallest")
    }
