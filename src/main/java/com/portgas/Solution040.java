package com.portgas;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution040 {

    /**
     * 最小的 K 个数：
     * 输入n个整数，找出其中最小的K个数。
     * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
     **/

    //维护一个大小为 K 的最小堆过程如下：在添加一个元素之后，如果大顶堆的大小大于 K，那么需要将大顶堆的堆顶元素去除。
    public ArrayList<Integer> getLeastNumbersSolution(int[] input, int k) {
        if (k > input.length || k <= 0) {
            return new ArrayList<>();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1); // 大顶堆
        for (int num : input) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return new ArrayList<>(maxHeap);
    }
}
