package algorithms.recursionListTasks

/**
 * Sums all Integer items in the list
 */
fun sumListItems(list: List<Int>): Int {
    return if (list.isEmpty()) {
        0
    } else {
        val ls = list.toMutableList()
        ls.removeFirstOrNull()
        list[0] + sumListItems(ls)
    }
}

/**
 * Counts the number of items in the list
 */
fun <T> countListItems(list: List<T>): Int {
    return if (list.isEmpty()) {
        0
    } else {
        val ls = list.toMutableList()
        ls.removeFirstOrNull()
        1 + countListItems(ls)
    }
}

/**
 * Finds the largest number of Integers in the list
 */
fun maxListNumber(list: List<Int?>): Int? {
    return if (list.isEmpty()) {
        null
    } else {
        val ls = list.toMutableList()
        val item = ls.removeFirst()

        return if (ls.isEmpty()) {
            item
        } else {
            val next = maxListNumber(ls)
            if (item!! < next!!) next else item
        }
    }
}

/**
 * Quick sort implementation
 * <T : Comparable<T>> type.
 */
fun <T : Comparable<T>> quickSort(list: List<T>): List<T> {
    // Base case
    return if (list.size < 2) {
        list
        // Recursive case
    } else {
        val index = list.size /  2
        val pivot = list[index]

        val greater = list.filter { it > pivot }
        val lower = list.filter { it <= pivot }

        quickSort(lower.slice(0 until lower.size - 1)) + pivot + quickSort(greater)
    }
}