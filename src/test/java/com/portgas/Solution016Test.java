package com.portgas;

import org.junit.Test;

public class Solution016Test {

    @Test
    public void test() {
        // function 1
        double result1 = new Solution016().power(5.1, 6);
        double result2 = new Solution016().power(2.3, 5);
        double result3 = new Solution016().power(4.5, 3);

        double result4 = new Solution016().power2(5.1, 6);
        double result5 = new Solution016().power2(2.3, 5);
        double result6 = new Solution016().power2(4.5, 3);

        System.out.println("result1 = " + result1
                + "\n" + "result2 = " + result2
                + "\n" + "result3 = " + result3
                + "\n" + "result4 = " + result4
                + "\n" + "result5 = " + result5
                + "\n" + "result6 = " + result6
        );
    }

}
