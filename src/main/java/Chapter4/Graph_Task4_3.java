package Chapter4;

import java.util.*;

/**
 * Для бинарного дерева разработайте алгоритм, который создает связный список всех узлов, находящихся на каждой глубине
 *  (для дерева с глубиной D должно получиться D связных списков).
 */
public class Graph_Task4_3 {
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
    public Map<Integer, LinkedList<Node>> hasPathDFSBFS(Node source) {
        LinkedList<Node> nextToVisit = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        Map<Integer, LinkedList<Node>> result = new HashMap<>();

        //noinspection UseBulkOperation
        source.adjacent.forEach(nextToVisit::add);
        LinkedList<Node> rootList = new LinkedList<>();
        rootList.add(source);
        result.put(0, rootList);

        int levelCounter = 1;
        while (!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();
            LinkedList<Node> levelNodes = new LinkedList<>();
            if (node.adjacent.size() > 0) {
                //noinspection UseBulkOperation
                node.adjacent.forEach(levelNodes::add);
                //noinspection UseBulkOperation
                node.adjacent.forEach(nextToVisit::add);
            } else {
                levelNodes.add(node);
            }
            levelNodes.stream().map(n -> n.id).forEach(visited::add);
            result.put(levelCounter, levelNodes);
            if (visited.contains(node.id)) {
                continue;
            }
            levelCounter++;
        }
        return result;
    }
}
