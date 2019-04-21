package com.portgas;

public class Solution039 {

    /**
     * 数组中出现次数超过一半的数字：
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在
     * 数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则
     * 输出0。
     **/
    public int moreThanHalfNumSolution(int[] array) {
        int majority = array[0];
        for (int i = 1, cnt = 1; i < array.length; i++) {
            cnt = array[i] == majority ? cnt + 1 : cnt - 1;
            if (cnt == 0) {
                majority = array[i];
                cnt = 1;
            }
        }
        int cnt = 0;
        for (int val : array)
            if (val == majority)
                cnt++;
        return cnt > array.length / 2 ? majority : 0;
    }

}
