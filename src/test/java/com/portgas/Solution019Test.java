package com.portgas;

import org.junit.Test;

public class Solution019Test {

    @Test
    public void test() {
        String str1 = "aaa";
        String pattern1 = "ab*ac*a";
        boolean result1 = new Solution019().match(str1.toCharArray(), pattern1.toCharArray());

        System.out.println("result1 = " + result1
//                + "\n" + "result2 = " + result2
        );
    }

}
