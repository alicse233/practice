import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
* Complete the 'birthdayCakeCandles' function below.
*
* The function is expected to return an INTEGER.
* The function accepts INTEGER_ARRAY candles as parameter.
*/

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here

    // 1 - find largest number
    // 2 - occurance in array
    
    // 1 - first loop -> find largest number
    // 2 - update counter on ccurance

    var largestNumber = 0
    var occurance = 0
    
    candles.forEach {
        if(it > largestNumber) largestNumber = it
    }
    
    candles.forEach {
        if(it == largestNumber) occurance += 1
    }
    
    return occurance
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}