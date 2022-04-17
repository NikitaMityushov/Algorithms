package algorithms

import algorithms.recursionListTasks.maxListNumber

fun main() {
    val list1 = listOf(-20, 1, 0, 256, -12, 34, 54, 99, 112)
    val list2 = listOf(254, -20, 1, 0, 112, -12, 34, 54, 99)
//    val list1 = listOf(-20, 1)
    val list = algorithms.recursionListTasks.quickSort(list2)
    println(list)
}
