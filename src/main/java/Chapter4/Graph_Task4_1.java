package Chapter4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Для заданного направленного графа разработайте алгоритм, проверяющий существование маршрута между двумя узлами.
 */
public class Graph_Task4_1 {

    private HashMap<Integer, Node> nodeData = new HashMap<>();

    @SuppressWarnings("WeakerAccess")
    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<>();

        public Node(int id) {
            this.id = id;
        }

        public LinkedList<Node> getAdjacent() {
            return adjacent;
        }
    }

    @SuppressWarnings("unused")
    public HashMap<Integer, Node> getNodeData() {
        return nodeData;
    }

    @SuppressWarnings("WeakerAccess")
    public void setNodeData(HashMap<Integer, Node> nodeData) {
        this.nodeData = nodeData;
    }

    @SuppressWarnings("WeakerAccess")
    public boolean hasPathBFS(Node source, Node destination) {
        LinkedList<Node> nextToVisit = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        nextToVisit.add(source);
        while (!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();
            if (node == destination) {
                return true;
            }

            if (visited.contains(node.id)) {
                continue;
            }
            visited.add(node.id);

            for (Node child : node.adjacent) {
                //noinspection UseBulkOperation
                nextToVisit.add(child);
            }
        }
        return false;
    }
}
