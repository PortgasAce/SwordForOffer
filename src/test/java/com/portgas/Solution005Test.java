package com.portgas;

import org.junit.Test;

public class Solution005Test {

    @Test
    public void test() {
        String str1 = "A B";
        String str2 = "";
        String str3 = " AB ";

        String result1 = new Solution005().replaceSpace(new StringBuffer(str1));
        String result2 = new Solution005().replaceSpace(new StringBuffer(str2));
        String result3 = new Solution005().replaceSpace(new StringBuffer(str3));
        System.out.println("result1 = " + result1
                + "\nresult2 = " + result2
                + "\nresult3 = " + result3);

        String result4 = new Solution005().replaceSpace2(new StringBuffer(str1));
        String result5 = new Solution005().replaceSpace2(new StringBuffer(str2));
        String result6 = new Solution005().replaceSpace2(new StringBuffer(str3));
        System.out.println("result4 = " + result4
                + "\nresult5 = " + result5
                + "\nresult6 = " + result6);


        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            new Solution005().replaceSpace(new StringBuffer(str1));
        }
        System.out.println("time1 = " + (System.currentTimeMillis() - time1));

        long time2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            new Solution005().replaceSpace2(new StringBuffer(str1));
        }
        System.out.println("time2 = " + (System.currentTimeMillis() - time2));


    }

}
