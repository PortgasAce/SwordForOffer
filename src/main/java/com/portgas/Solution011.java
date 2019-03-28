package com.portgas;

public class Solution011 {

    /**
     * 旋转数组的最小数字:
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组 {3, 4, 5, 1, 2} 为 {1, 2, 3, 4, 5} 的一个旋转，该数组的最小值为 1。
     **/
    // 二分查找改造：
    public int minNumberInRotateArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int middle = (low + high) / 2;
            if (nums[middle] >= high) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }
        return nums[low];
    }

    public int minNumberInRotateArray2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int middle = (low + high) / 2;
            if (nums[middle] == nums[low] && nums[low] == nums[high]) {
                return minNumber(nums, low, high);
            } else if (nums[middle] >= high) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }
        return nums[low];
    }

    private int minNumber(int[] nums, int low, int high) {
        for (int i = low; i < high; i++)
            if (nums[i] > nums[i + 1])
                return nums[i + 1];
        return nums[low];
    }

}
