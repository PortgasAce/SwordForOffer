package com.portgas;

import java.util.Stack;

public class Solution031 {

    /**
     * 栈的压入、弹出序列：
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
     * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压
     * 栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
     * （注意：这两个序列的长度是相等的）
     **/

    public boolean isPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int pushIndex = 0; pushIndex < pushA.length; pushIndex++) {
            stack.push(pushA[pushIndex]);
            while (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }

    public boolean isPopOrder2(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int pushIndex = 0; pushIndex < pushA.length; pushIndex++) {
            if (popA[popIndex] == pushA[pushIndex]) {
                // 相同则出栈
                popIndex++;
                while (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
                    stack.pop();
                    popIndex++;
                }
            } else {
                // 不同则入栈
                stack.push(pushA[pushIndex]);
            }
        }
        return stack.isEmpty();
    }
}
