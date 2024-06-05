import java.math.BigInteger

fun aVeryBigSum(ar: Array<Long>): Long {
    var sum = 0L  // Initialize sum as Long to handle large values
    for (num in ar) {
        sum += num  // Add each element of the array to sum
    }
    return sum
}

fun main() {
    // Sample input
    val ar: List<Long> = listOf(5L, 1_000_000_0000_000_004L, 10005L)

    // Compute and print the sum of the array elements
    val result = aVeryBigSum(ar.toTypedArray())
    println(result)
}
