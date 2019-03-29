package com.portgas;

public class Solution018 {

    public static class ListNode {

        public int value;
        public ListNode next;

        public ListNode(int i) {
            value = i;
        }
    }

    /**
     * 在 O(1) 时间内删除链表节点
     **/
    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if (head == null || tobeDelete == null) {
            return null;
        }

        if (tobeDelete.next != null) {
            // 把next的值复制到tobeDelete，然后next节点成为了真正的tobeDelete节点
            ListNode next = tobeDelete.next;
            tobeDelete.value = next.value;
            tobeDelete.next = next.next;
            next.next = null;
        } else {
            if (head == tobeDelete) {
                // 只有一个节点
                head = null;
            } else {
                // 尾节点，需要找到前驱节点
                ListNode cur = head;
                while (cur.next != tobeDelete)
                    cur = cur.next;
                cur.next = null;
            }
        }
        return head;
    }


    /**
     * 删除链表中重复的结点：
     * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
     * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     **/
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }

        ListNode next = pHead.next;
        if (pHead.value == next.value) {
            // 找到pHead与不相等的next
            while (next != null && pHead.value == next.value) {
                next = next.next;
            }
            return deleteDuplication(next);
        } else {
            pHead.next = deleteDuplication(next);
            return pHead;
        }

    }

}
