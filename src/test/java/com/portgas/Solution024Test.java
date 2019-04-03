package com.portgas;

import com.portgas.Solution024.ListNode;
import org.junit.Test;

public class Solution024Test {

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

        ListNode result1 = new Solution024().reverseList(node1);
        printList(result1);
    }

    private void printList(Solution024.ListNode head) {
        while (head != null) {
            System.out.print(head.value + ",");
            head = head.next;
        }
    }

}
