package com.dsa.dsa.dsa2023.kotlindsa

data class User (
        var name: String,
        var age: Int
) {
    var address: String? = null

    val sum = {
        a:Int, b: Int -> a + b
    }

}

fun main(){
    val user = User("Kevin",22)
    val ans = user.sum(10,20)

    println(ans)

    Logger.message("Hello ${user.name}")

    Logger.workingWithLists()
    Logger.printLength("Hello ${user.name}")

}

object Logger {
    fun message(message: String){
        println(message)
    }
    fun workingWithLists(){
        val a = listOf(1,2,3,4,5)
        val b = a.map {
            it * 2
        }

        println(b)
    }

    fun printLength(name: String?){
        println(name?.length)
    }
}