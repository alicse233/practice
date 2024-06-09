package org.example

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
* Complete the 'plusMinus' function below.
*
* The function accepts INTEGER_ARRAY arr as parameter.
*/

fun plusMinus(arr: Array<Int>) {
    // Write your code here
    
    var positive = 0
    var negative = 0
    var zero = 0
    
    arr.forEach{
        if (it < 0)  {
            negative += 1
        } else if (it > 0) {
            positive += 1
        } else {
            zero += 1
        }    
    }
    
    val arrSize = arr.size.toDouble()
    println("%6f".format(positive/arrSize))
    println("%6f".format(negative/arrSize))
    println("%6f".format(zero/arrSize))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}