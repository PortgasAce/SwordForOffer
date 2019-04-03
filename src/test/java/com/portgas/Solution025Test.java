package com.portgas;

import com.portgas.Solution025.ListNode;
import org.junit.Test;

public class Solution025Test {

    @Test
    public void test() {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(3);
        ListNode node7 = new ListNode(4);
        ListNode node8 = new ListNode(6);

        node5.next = node6;
        node6.next = node7;
        node7.next = node8;


        ListNode result1 = new Solution025().merge(node1,node5);
        printList(result1);
    }

    private void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + ",");
            head = head.next;
        }
    }

}
