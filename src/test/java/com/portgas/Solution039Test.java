package com.portgas;

import org.junit.Test;

import java.util.ArrayList;

public class Solution038Test {

    @Test
    public void test() {
        ArrayList<String> result1 = new Solution038().permutation("abcd");
        System.out.println("result1.size = " + result1.size());
        for (String s : result1) {
            System.out.println(s);
        }
        System.out.println("------------");
        ArrayList<String> result2 = new Solution038().permutation("abcc");
        System.out.println("result2.size = " + result2.size());
        for (String s : result2) {
            System.out.println(s);
        }
    }

}
