package Chapter4;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class TestTask4_3 {
    @Test
    public void checkTask4_3() {
        Graph_Task4_3 graphTask4_3 = new Graph_Task4_3();

        Graph_Task4_3.Node firstNode = new Graph_Task4_3.Node(1);
        Graph_Task4_3.Node secondNode = new Graph_Task4_3.Node(2);
        Graph_Task4_3.Node thirdNode = new Graph_Task4_3.Node(3);
        Graph_Task4_3.Node fourthNode = new Graph_Task4_3.Node(4);
        Graph_Task4_3.Node fifthNode = new Graph_Task4_3.Node(5);

        LinkedList<Graph_Task4_3.Node> firstNodeAdjacent = firstNode.getAdjacent();
        firstNodeAdjacent.add(thirdNode);
        LinkedList<Graph_Task4_3.Node> thirdNodeAdjacent = thirdNode.getAdjacent();
        thirdNodeAdjacent.add(secondNode);
        thirdNodeAdjacent.add(fourthNode);
        LinkedList<Graph_Task4_3.Node> fourthNodeAdjacent = fourthNode.getAdjacent();
        fourthNodeAdjacent.add(fifthNode);

        HashMap<Integer, Graph_Task4_3.Node> nodeData = new HashMap<>();
        nodeData.put(1, firstNode);
        nodeData.put(2, secondNode);
        nodeData.put(3, thirdNode);
        nodeData.put(4, fourthNode);
        nodeData.put(5, fifthNode);

        graphTask4_3.setNodeData(nodeData);

        Map<Integer, LinkedList<Graph_Task4_3.Node>> result = graphTask4_3.hasPathDFSBFS(firstNode);
        assertTrue(result.values().size() == 3);
        assertTrue(result.get(0).size() == 1);
        assertTrue(result.get(1).size() == 2);

    }
}
