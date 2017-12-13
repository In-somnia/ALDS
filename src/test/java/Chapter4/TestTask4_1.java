package Chapter4;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestTask4_1 {

    @Test
    public void checkTask4_1() {
        Graph_Task4_1 graphTask41 = new Graph_Task4_1();

        Graph_Task4_1.Node firstNode = new Graph_Task4_1.Node(1);
        Graph_Task4_1.Node secondNode = new Graph_Task4_1.Node(2);
        Graph_Task4_1.Node thirdNode = new Graph_Task4_1.Node(3);
        Graph_Task4_1.Node fourthNode = new Graph_Task4_1.Node(4);
        Graph_Task4_1.Node fifthNode = new Graph_Task4_1.Node(5);

        LinkedList<Graph_Task4_1.Node> firstNodeAdjacent = firstNode.getAdjacent();
        firstNodeAdjacent.add(thirdNode);
        LinkedList<Graph_Task4_1.Node> thirdNodeAdjacent = thirdNode.getAdjacent();
        thirdNodeAdjacent.add(secondNode);
        thirdNodeAdjacent.add(fourthNode);
        LinkedList<Graph_Task4_1.Node> fourthNodeAdjacent = fourthNode.getAdjacent();
        fourthNodeAdjacent.add(fifthNode);

        HashMap<Integer, Graph_Task4_1.Node> nodeData = new HashMap<>();
        nodeData.put(1, firstNode);
        nodeData.put(2, secondNode);
        nodeData.put(3, thirdNode);
        nodeData.put(4, fourthNode);
        nodeData.put(5, fifthNode);

        graphTask41.setNodeData(nodeData);

        assertTrue(graphTask41.hasPathBFS(fifthNode, fifthNode));
        assertFalse(graphTask41.hasPathBFS(secondNode, fifthNode));
    }
}
