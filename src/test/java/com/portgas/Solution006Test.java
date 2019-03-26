package com.portgas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution006Test {

    @Test
    public void test() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Solution006.ListNode listNode = new Solution006.ListNode(-1);
        Solution006.ListNode head = listNode;
        for (Integer i : list) {
            listNode.next = new Solution006.ListNode(i);
            listNode = listNode.next;
        }


        ArrayList<Integer> result1 = new Solution006().printListFromTailToHead(head.next);
        for (Integer i : result1) {
            System.out.print(i + ",");
        }

    }

}
