package com.portgas;

public class Solution003 {

    /**
     * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知
     * 道每个数字重复几次。请找出数组中任意一个重复的数字
     **/

    public boolean duplicate(int[] array) {
        if (array == null || array.length <= 0) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            // 如果array[i]的值不等于数组下标，就将array[i]从下标i交换至下标为array[i]。
            if (array[i] != i) {
                // 交换之前判断重复
                if (array[i] == array[array[i]]) {
                    return true;
                }

                // 不重复则交换
                swap(array, i, array[i]);
            }
        }
        return false;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[i];
        array[j] = temp;
    }

}
