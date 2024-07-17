package com.example.setuptest

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
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val zone = s.substring(8, 10)
    val hour = s.substring(0, 2)
    val minuteSeconds = s.substring(3, 8)

    if(zone == "PM") {
        val updatedHour = if(hour.toInt() < 12) {
            hour.toInt()+12
        } else {
            hour.toInt()
        }
        return "$updatedHour:$minuteSeconds"
    } else {
        val updatedAMHour = if(hour.toInt() == 12) "00" else hour
        return "$updatedAMHour:$minuteSeconds"
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}