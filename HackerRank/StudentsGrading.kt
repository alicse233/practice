package com.example.setuptest.practice


fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    val resultArr = arrayListOf<Int>()
    grades.forEach { grade ->
        val remainder = grade % 5
        if (grade < 38) {
            resultArr.add(grade)
        } else {
            if (remainder > 2) {
                //remainder should be subtracted from 5 to make it fully divisible by 5
                resultArr.add(grade+(5 - remainder))
            } else {
                resultArr.add(grade)
            }
        }
    }
    return resultArr.toTypedArray()
}