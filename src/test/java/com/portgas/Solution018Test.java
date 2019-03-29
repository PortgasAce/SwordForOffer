package com.portgas;

import org.junit.Test;

public class Solution018Test {

    @Test
    public void test() {
        Solution018.ListNode node1 = new Solution018.ListNode(1);
        Solution018.ListNode node2 = new Solution018.ListNode(2);
        Solution018.ListNode node3 = new Solution018.ListNode(2);
        Solution018.ListNode node4 = new Solution018.ListNode(3);
        Solution018.ListNode node5 = new Solution018.ListNode(3);
        Solution018.ListNode node6 = new Solution018.ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Solution018.ListNode head = new Solution018().deleteDuplication(node1);
        printList(head);
    }

    private void printList(Solution018.ListNode head) {
        while (head != null) {
            System.out.print(head.value + ",");
            head = head.next;
        }
    }
}
