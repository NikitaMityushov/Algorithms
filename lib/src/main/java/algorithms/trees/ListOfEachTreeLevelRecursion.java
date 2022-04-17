package algorithms.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Your task is to return the list with elements from tree sorted by levels,
 * which means the root element goes first, then root children (from left to right) are second and third,
 * and so on.
 */
public class ListOfEachTreeLevelRecursion implements EachTreeLevel {
    public List<Integer> treeByLevels(Node node) {
        // result list
        List<Integer> list = new ArrayList<>();
        // 1) find height of the tree
        var h = findHeight(node);
        // 2) add values of each level of tree in the list
        for (int i = 1; i <= h; ++i) {
            addLevelItems(list, node, i);
        }
        return list;
    }

    /**
     * Method add tree values of specified level.
     *
     * @param node is node of binary tree
     * @param h is a level of tree
     */
    private static void addLevelItems(List<Integer> list, Node node, int h) {
        // base
        if (node == null) {
            return;
        }

        if (h == 1) {
            list.add(node.value);
        } else {
            // recursive
            addLevelItems(list, node.left, h - 1);
            addLevelItems(list, node.right, h - 1);
        }
    }

    /**
     * Finds height of binary tree
     * @param node is node of binary tree
     * @return int height of tree
     */
    private static int findHeight(Node node) {
        // base
        if (node == null) {
            return 0;
        }
        // recursive
        var i1 = 1 + findHeight(node.left);
        var i2 = 1 + findHeight(node.right);
        return Math.max(i1, i2);
    }
}

/**
 * Tree implementation
 */
class Node {
    public Node left;
    public Node right;
    public int value;

    public Node(Node l, Node r, int v) {
        left = l;
        right = r;
        value = v;
    }
}
