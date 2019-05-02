package com.portgas;

import org.junit.Test;

public class Solution041_2Test {

    @Test
    public void test() {

        Solution041_2 solution041_2 = new Solution041_2();

        String s1 = "google";
        for (char character : s1.toCharArray()) {
            solution041_2.insert(character);
            System.out.println("insert: " + character + ", median = " + solution041_2.firstAppearingOnce());
        }
    }

}
