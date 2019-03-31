package com.portgas;

import org.junit.Assert;
import org.junit.Test;
import com.portgas.Solution022.ListNode;

public class Solution022Test {

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

        ListNode result1 = new Solution022().findKthToTail(node1, 1);
        ListNode result2 = new Solution022().findKthToTail(node1, 2);
        ListNode result3 = new Solution022().findKthToTail(node1, 3);
        ListNode result6 = new Solution022().findKthToTail(node1, 6);

        System.out.print("倒数第1个节点：" + result1.value
                + "\n" + "倒数第2个节点：" + result2.value
                + "\n" + "倒数第3个节点：" + result3.value
                + "\n" + "倒数第6个节点：" + result6
        );
    }

}
