package com.example.meli.practice
fun main() {
    val dictionary = mapOf(
        "mutable" to "can be changed and reassigned.",
        "immutable" to "cannot be changed or reassigned",
        "array" to "collection of fixed sized elements which is stored in order",
        "arraylist" to "resizable collection of elements",
        "operators" to "symbols to perform operations like arithmetic,assignment,etc"
    )

    print("Enter the word")
    val input = readln().lowercase()
    println(dictionary[input])
}
