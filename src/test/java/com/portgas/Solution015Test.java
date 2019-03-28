package com.portgas;

import org.junit.Test;

public class Solution015Test {

    @Test
    public void test() {
        // function 1
        int result1 = new Solution015().numberOf1(13);
        int result2 = new Solution015().numberOf1(31);
        int result3 = new Solution015().numberOf1(63);
        int result4 = new Solution015().numberOf1(127);
        // function 2
        int result5 = new Solution015().numberOf12(13);
        int result6 = new Solution015().numberOf12(31);
        int result7 = new Solution015().numberOf12(63);
        int result8 = new Solution015().numberOf12(127);

        System.out.println("result1 = " + result1
                + "\n" + "result2 = " + result2
                + "\n" + "result3 = " + result3
                + "\n" + "result4 = " + result4
                + "\n" + "result5 = " + result5
                + "\n" + "result6 = " + result6
                + "\n" + "result7 = " + result7
                + "\n" + "result8 = " + result8
        );
    }

}
