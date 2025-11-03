package com.example.meli.practice
fun main(){
        //mutable ma reassign garna milcha ani int string sab capital
        var name: String = "meli"
        name = "salifa"
    println(name)
      //immutable
        val age: Int = 16
        //to print use print or println
        println("my name is $name and age is $age") //salifa ko naam huncha as its reassigned
        //variable ko aru ni access garne vaye {$name.uppercase()}
    //immutable
    val number =listOf("five","nine","fifty","eight")
    println ("list")
    for (i in number.indices){// so like indices gives all the valid positions (indexes)
        println(number[i])
    }
    println()


}



