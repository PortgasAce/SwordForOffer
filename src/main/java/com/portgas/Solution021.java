package com.portgas;

import java.util.ArrayList;
import java.util.List;

public class Solution021 {

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的
     * 后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     **/
    public void reOrderArray(int[] array) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odd.add(array[i]);
            } else {
                even.add(array[i]);
            }
        }
        odd.addAll(even);
        for (int i = 0; i < array.length; i++) {
            array[i] = odd.get(i);
        }
    }

}
