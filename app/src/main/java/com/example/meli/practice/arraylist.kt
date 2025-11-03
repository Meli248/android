package com.example.meli.practice
fun main() {
    var animal = ArrayList<String>()
    animal.add("dog")//index=0 and element is dog
    animal.add(1, "cat")
    animal.add("eagle")
    animal.add("peacock")
    animal.add("hippo")
    animal.remove("cat")
    animal.removeAt(2)//cant use 4 cuz after cat is removed then index 4 doesnt exist and peacocks index becomes 2 instead of 3 after cat is removed
    println("animals $animal")

// mixed arraylist
    val mixArrayList = arrayListOf<Any>("eagle", 2, 4, 5.0)// 5.0 didnt show in output cuz of indexing as cat and peacock got removed theres only indexing till 2
    println(mixArrayList[0]);
    println(mixArrayList[1]);
    println(mixArrayList[2]);

}
