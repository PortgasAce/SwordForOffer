package com.portgas;

import java.util.Stack;

public class Solution009 {

    /**
     * 用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。
     **/

    Stack<Integer> stack1 = new Stack<Integer>();   // push
    Stack<Integer> stack2 = new Stack<Integer>();   // pop

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
