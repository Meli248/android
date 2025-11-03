package com.example.meli.practice
fun main() {
    var a:Int=2
    var b:Int=3
    var c:Int =0
    //arithmetic operator
    c=a+b
    println("a+b=$c")
    c+= a
    println("c+=$c")
    c-=a
    println("c-=a=$c")
    c*=a
    println("c*=a=$c")
    c/=a
    println("c/=a=$c")

    //unary operator
    var num: Double = 3.4
    var isCheck: Boolean=true;
    println("+numbber=${+num}")
    println("-numbber=${-num}")
    println("++numbber=${++num}")//increment
    println("--numbber=${-+num}")//decrement
    println("!isCheck=${!isCheck}")//complement



        // Console input
        print("Enter student: ")
        var student: String = readln();
        print("Enter marks: ")
        val marks: Int = readln()!!.toInt() //!! means the unput will not be null  and toInt will convert string to int
        println("student name: $student, Age: $marks")
}








