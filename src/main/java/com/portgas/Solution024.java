package com.portgas;


public class Solution024 {

    public static class ListNode {

        public int value;
        public ListNode next;

        public ListNode(int i) {
            value = i;
        }
    }

    /**
     * 反转链表：
     * 输入一个链表，反转链表后，输出新链表的表头。
     **/
    // 头插法
    public ListNode reverseList(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        ListNode temp;
        while (head != null) {
            temp = head.next;
            head.next = dummyHead.next;
            dummyHead.next = head;
            head = temp;
        }
        return dummyHead.next;
    }

}
