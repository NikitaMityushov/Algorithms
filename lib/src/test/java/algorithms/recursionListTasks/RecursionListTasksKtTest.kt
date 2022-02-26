package algorithms.recursionListTasks

import org.junit.Test

import org.junit.Assert.*

class RecursionListTasksKtTest {
    private val list1 = listOf(-20, 1, 0, 112, -12, 34, 54, 99)
    private val emptyList = emptyList<Int>()

    @Test
    fun sumListItem() {
        // given the list contains Integers
        // when items of the list is -20, 1, 0, -12, 34, 54, 99, 112
        // then sum of all items is 268
        assertEquals(268, sumListItems(list1))
    }

    @Test
    fun ifEmptyListSumOfListIsZero() {
        // given the list contains Integers
        // when list is empty
        // then sum of all items is 0
        assertEquals(0, sumListItems(emptyList))
    }

    @Test
    fun countListItemsEqualsZero() {
        // given the list contains Integers
        // when list is empty
        // then number of all items is 0
        assertEquals(0, countListItems(emptyList))
    }

    @Test
    fun countListItemsEqualsEight() {
        // given the list contains Integers
        // when list is empty
        // then number of all items is 0
        assertEquals(8, countListItems(list1))
    }

    @Test
    fun largestNumberInTheListIsOneHundredTwelve() {
        // given the list contains Integers
        // when
        // then the largest number of all items is 112
        assertEquals(112, maxListNumber(list1))
    }
}