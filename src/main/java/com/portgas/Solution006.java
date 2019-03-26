package com.portgas;

import java.util.ArrayList;

public class Solution006 {

    public static class ListNode {

        public Integer value;
        public ListNode next;

        public ListNode(int i) {
            value = i;
        }
    }

    /**
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     **/

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return null;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode revertList = revertList1(listNode);
        while (revertList != null) {
            arrayList.add(revertList.value);
            revertList = revertList.next;
        }
        return arrayList;
    }

    // 头插法
    private ListNode revertList1(ListNode listNode) {
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode temp = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = temp;
        }
        return head.next;
    }

    // 递归法
    private ListNode revertList2(ListNode listNode) {
        if (listNode == null) {
            return null;
        }

        if (listNode.next == null) {
            return listNode;
        }

        ListNode next = listNode.next;
        ListNode revertList = revertList2(listNode.next);
        if (revertList != null) {
            next.next = listNode;
            listNode.next = null;   // 防止回环
        }
        return revertList;
    }

}
