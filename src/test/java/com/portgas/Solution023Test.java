package com.portgas;

import com.portgas.Solution023.ListNode;
import org.junit.Test;

public class Solution023Test {

    @Test
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // 无环情况
        ListNode result1 = new Solution023().entryNodeOfLoop(node1);
        ListNode result2 = new Solution023().entryNodeOfLoop2(node1);

        System.out.print("result1 = " + result1
                + "\n" + "result2 = " + result2
        );
        System.out.println();

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;  // 环入口 node3

        ListNode result3 = new Solution023().entryNodeOfLoop(node1);
        ListNode result4 = new Solution023().entryNodeOfLoop2(node1);

        System.out.print("result3 = " + result3.value
                + "\n" + "result4 = " + result4.value
        );



    }

}
