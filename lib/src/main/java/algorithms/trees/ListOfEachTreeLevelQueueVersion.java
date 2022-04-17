package algorithms.trees;

import java.util.*;

public class ListOfEachTreeLevelQueueVersion implements EachTreeLevel {
    @Override
    public List<Integer> treeByLevels(Node node) {
        {
            if (node == null) return Collections.emptyList();
            List<Integer> res = new ArrayList<>();

            //breadth-first search
            Queue<Node> nodesToVisit = new ArrayDeque(); //ArrayDeque is better than LinkedList if no removing in between is involved
            nodesToVisit.offer(node);

            Node current;
            while ((current = nodesToVisit.poll()) != null) {
                res.add(current.value);
                if (current.left != null) nodesToVisit.offer(current.left);
                if (current.right != null) nodesToVisit.offer(current.right);
            }

            return res;
        }
    }
}
