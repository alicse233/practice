package org.example

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var rightDiagonal = 0
    var leftDiagonal = 0
    
    for(i in arr.indices) {
        leftDiagonal += arr[i][i] 
        rightDiagonal += arr[i][(arr.size-1)-i]
    }
    
    return Math.abs(leftDiagonal-rightDiagonal)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
