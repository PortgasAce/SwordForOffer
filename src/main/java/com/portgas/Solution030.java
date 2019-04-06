package com.portgas;

import java.util.Stack;

public class Solution030 {

    /**
     * 包含 min 函数的栈：
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
     **/

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();     // 记录每一次push后的最小值

    public void push(int node) {
        stack.push(node);
        min.push(min.isEmpty() ? node : Math.min(min.peek(), node));
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
}
