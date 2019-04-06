package com.portgas;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Solution030Test {

    @Test
    public void test() {
        // 4 3 5 2 1
        Solution030 stack = new Solution030();
        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);

        Assert.assertEquals(stack.min(), 1);
        System.out.println("当前最小值期望为1，实际为：" + stack.min());
        stack.pop();

        Assert.assertEquals(stack.min(), 2);
        System.out.println("当前最小值期望为2，实际为：" + stack.min());
        stack.pop();

        Assert.assertEquals(stack.min(), 3);
        System.out.println("当前最小值期望为3，实际为：" + stack.min());
        stack.pop();

        Assert.assertEquals(stack.min(), 3);
        System.out.println("当前最小值期望为3，实际为：" + stack.min());
        stack.pop();

        Assert.assertEquals(stack.min(), 4);
        System.out.println("当前最小值期望为4，实际为：" + stack.min());
        stack.pop();
    }


}
