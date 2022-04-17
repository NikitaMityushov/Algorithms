package algorithms.trees;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListOfEachTreeLevelQueueVersionTest {
    private final ListOfEachTreeLevelQueueVersion inst = new ListOfEachTreeLevelQueueVersion();

    @Test
    public void nullTest() {
        assertEquals(List.of(), inst.treeByLevels(null));
    }

    @Test
    public void basicTest() {
        long i1 = System.currentTimeMillis();
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), inst.treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1)));
        long i2 = System.currentTimeMillis();
        System.out.println("Queue time: " + (i2 - i1));
    }
}