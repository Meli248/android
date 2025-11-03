package com.example.meli.practice

fun main() {
    val country = arrayOf("nepal", "china", "malaysia")
    country[2] = "india"
    println("The first element of country is " + country[0])
    println("The second element of country is " + country[1])
    println("The third element of country is " + country[2])
    println(country.size)

}
