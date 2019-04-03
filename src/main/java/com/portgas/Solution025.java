package com.portgas;


public class Solution025 {

    public static class ListNode {

        public int value;
        public ListNode next;

        public ListNode(int i) {
            value = i;
        }
    }

    /**
     * 合并两个排序的链表：
     * 输入两个单调递增的链表，输出两个链表合成后的链表，
     * 当然我们需要合成后的链表满足单调不减规则。
     **/
    public ListNode merge(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;

        do {
            if (list1.value < list2.value) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        } while (list1 != null && list2 != null);

        if (list1 == null) {
            cur.next = list2;
        }
        if (list2 == null) {
            cur.next = list1;
        }

        return dummyHead.next;
    }

}
