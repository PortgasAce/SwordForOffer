package com.portgas;

import org.junit.Test;

public class Solution008Test {

    @Test
    public void test() {
        int[] inOrder = {2, 1, 4, 3, 5};

        Solution008.TreeLinkNode linkNode1 = new Solution008.TreeLinkNode(1);
        Solution008.TreeLinkNode linkNode2 = new Solution008.TreeLinkNode(2);
        Solution008.TreeLinkNode linkNode3 = new Solution008.TreeLinkNode(3);
        Solution008.TreeLinkNode linkNode4 = new Solution008.TreeLinkNode(4);
        Solution008.TreeLinkNode linkNode5 = new Solution008.TreeLinkNode(5);
        linkNode1.left = linkNode2;
        linkNode1.right = linkNode3;
        linkNode2.next = linkNode1;
        linkNode3.next = linkNode1;
        linkNode3.left = linkNode4;
        linkNode3.right = linkNode5;
        linkNode4.next = linkNode3;
        linkNode5.next = linkNode3;

        Solution008.TreeLinkNode next1 = new Solution008().getNext(linkNode1);
        Solution008.TreeLinkNode next2 = new Solution008().getNext(linkNode2);
        Solution008.TreeLinkNode next3 = new Solution008().getNext(linkNode3);
        Solution008.TreeLinkNode next4 = new Solution008().getNext(linkNode4);
        Solution008.TreeLinkNode next5 = new Solution008().getNext(linkNode5);

        System.out.println("next1 = " + next1
                + "\nnext2 = " + next2
                + "\nnext3 = " + next3
                + "\nnext4 = " + next4
                + "\nnext5 = " + next5);
    }

}
