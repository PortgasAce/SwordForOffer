package com.portgas;


public class Solution022 {

    public static class ListNode {

        public int value;
        public ListNode next;

        public ListNode(int i) {
            value = i;
        }
    }

    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     **/
    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode p1 = head;
        // 注意 是k-1步
        for (int i = 0; i < k - 1; i++) {
            if (p1.next != null) {
                p1 = p1.next;
            } else {
                return null;
            }
        }

        ListNode p2 = head;
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
