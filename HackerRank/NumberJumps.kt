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
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // If second kangaroo is ahead and moving faster or equal, they'll never meet
    if (x2 > x1 && v2 >= v1) {
        return "NO"
    }
    
    // If first kangaroo is ahead and moving faster or equal, they'll never meet
    if (x1 > x2 && v1 >= v2) {
        return "NO"
    }
    
    // If velocities are equal, they'll only meet if they start at same position
    if (v1 == v2) {
        return if (x1 == x2) "YES" else "NO"
    }
    
    // The position must be a whole number and positive
    // Using the formula: x1 + n*v1 = x2 + n*v2
    // Solving for n: n = (x2 - x1)/(v1 - v2)
    
    // Convert to Double for division
    val n = (x2 - x1).toDouble() / (v1 - v2).toDouble()
    
    // Check if n is positive and a whole number
    return if (n > 0 && n % 1 == 0.0) "YES" else "NO"
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
