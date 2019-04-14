package com.portgas;

import org.junit.Test;
import com.portgas.Solution035.RandomListNode;

public class Solution035Test {

    @Test
    public void test() {
        // 1 -> 2 -> 3 -> 4
        //      |_________|

        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);

        node1.next = node2;
        node2.next = node3;
        node2.random = node4;
        node3.next = node4;

        RandomListNode result1 = new Solution035().clone(node1);

        while (result1 != null) {
            System.out.print(result1.label);
            if (result1.random != null) {
                System.out.print("_random_" + result1.random.label);
            }
            System.out.print(",");
            result1 = result1.next;
        }
    }

}
