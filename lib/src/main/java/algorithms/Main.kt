package algorithms

import algorithms.recursionListTasks.maxListNumber

fun main() {
    val list1 = listOf(-20, 1, 0, 256, -12, 34, 54, 99, 112)
    println(maxListNumber(list1))
    val list2 = emptyList<Int>()
    println(maxListNumber(list2))
}
