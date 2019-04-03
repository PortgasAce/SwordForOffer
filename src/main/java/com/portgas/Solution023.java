package com.portgas;


public class Solution023 {

    public static class ListNode {

        public int value;
        public ListNode next;

        public ListNode(int i) {
            value = i;
        }
    }

    /**
     * 链表中环的入口结点：
     * 一个链表中包含环，请找出该链表的环的入口结点。要求不能使用额外的空间。
     **/

    /**
     * 快慢指针：
     * 指针p1，p2从表头出发，p1一次一步，p2一次两步，如果p2套圈与p1相遇，则有环。
     * 假设从表头到环入口的距离为a，环入口到相遇点距离为b，相遇点到环入口距离为c，b+c 为环的长度。
     * p1走的距离为 s1 = a + n(b+c) + b  , n为p1绕环的圈数
     * p2走的距离为 s2 = a + m(b+c) + b  , m为p2绕环的圈数
     * 由于  s2 = 2 * s1
     * 所以： a + m(b+c) +b = 2a + 2n(b+c) + 2b
     *              m(b+c) = a + 2n(b+c) + b
     *      (m-1)(b+c)+b+c = a + 2n(b+c) +b     （p2套圈p1，所以m >= 1）
     *    (m-2n-1)(b+c) +c = a
     *
     * 所以当p1与p2相遇后，p1从表头开始一次一步，p2从相遇点开始一次一步，两指针再次相遇时，
     * p1走了a，p2走了(m-2n-1)(b+c) + c，根据a与c的定义，再次相遇的点即为环入口。
     */
    public ListNode entryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return null;
        }

        ListNode p1 = pHead, p2 = pHead;
        // p2走的快，没必要判断p1
        do {
            p1 = p1.next;
            p2 = p2.next.next;
        } while (p2 != null && p2.next != null && p1 != p2);

        // 未相遇，无环
        if (p1 != p2){
            return null;
        }

        p1 = pHead;
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

    /**
     * 断链法：
     * 有环的情况下，从表头开始遍历，每经过一个节点，就将该节点与上一节点断开连接，则最后一个节点就是环入口
     * */
    public ListNode entryNodeOfLoop2(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return null;
        }

        ListNode p1 = pHead, p2 = pHead;
        // p2走的快，没必要判断p1
        do {
            p1 = p1.next;
            p2 = p2.next.next;
        } while (p2 != null && p2.next != null && p1 != p2);

        // 未相遇，无环
        if (p1 != p2){
            return null;
        }

        // 断链
        p1 = pHead;
        p2 = pHead.next;
        while (p2 != null){
            p1.next = null;
            p1 = p2;
            p2 = p2.next;
        }
        return p1;
    }


}
