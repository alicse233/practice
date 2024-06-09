package org.example

import kotlin.io.*
import kotlin.text.*

/*
* Complete the 'staircase' function below.
*
* The function accepts INTEGER n as parameter.
*/

fun staircase(n: Int): Unit {
    // Write your code here
    for(i in 1..n) {
        var numberOfSpaces = n-i
        var numberOfHashes = i
        println("${" ".repeat(numberOfSpaces)}${"#".repeat(numberOfHashes)}")
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}


