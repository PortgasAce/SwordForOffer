package com.portgas;

import org.junit.Test;

public class Solution020Test {

    @Test
    public void test() {
        // is number
        String num1 = "+100";
        String num2 = "5e2";
        String num3 = "-123";
        String num4 = "3.1416";
        String num5 = "-1E-16";

        // not number
        String notNum1 = "12e";
        String notNum2 = "1a3.14";
        String notNum3 = "1.2.3";
        String notNum4 = "+-5";
        String notNum5 = "12e+4.3";

        boolean resultNum1 = new Solution020().isNumeric(num1.toCharArray());
        boolean resultNum2 = new Solution020().isNumeric(num2.toCharArray());
        boolean resultNum3 = new Solution020().isNumeric(num3.toCharArray());
        boolean resultNum4 = new Solution020().isNumeric(num4.toCharArray());
        boolean resultNum5 = new Solution020().isNumeric(num5.toCharArray());

        boolean resultNotNum1 = new Solution020().isNumeric(notNum1.toCharArray());
        boolean resultNotNum2 = new Solution020().isNumeric(notNum2.toCharArray());
        boolean resultNotNum3 = new Solution020().isNumeric(notNum3.toCharArray());
        boolean resultNotNum4 = new Solution020().isNumeric(notNum4.toCharArray());
        boolean resultNotNum5 = new Solution020().isNumeric(notNum5.toCharArray());

        System.out.println("resultNum1 = " + resultNum1
                + "\n" + "resultNum2 = " + resultNum2
                + "\n" + "resultNum3 = " + resultNum3
                + "\n" + "resultNum4 = " + resultNum4
                + "\n" + "resultNum5 = " + resultNum5
                + "\n" + "resultNotNum1 = " + resultNotNum1
                + "\n" + "resultNotNum2 = " + resultNotNum2
                + "\n" + "resultNotNum3 = " + resultNotNum3
                + "\n" + "resultNotNum4 = " + resultNotNum4
                + "\n" + "resultNotNum5 = " + resultNotNum5
        );
    }

}
