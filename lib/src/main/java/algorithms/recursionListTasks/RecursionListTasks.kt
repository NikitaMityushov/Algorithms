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