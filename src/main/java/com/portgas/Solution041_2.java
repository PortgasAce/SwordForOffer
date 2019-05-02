package com.portgas;


import java.util.LinkedList;
import java.util.Queue;

public class Solution041_2 {

    /**
     * 字符流中第一个不重复的字符：
     * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
     * 例如，当从字符流中只读出前两个字符 "go" 时，第一个只
     * 出现一次的字符是 "g"。当从该字符流中读出前六个字符“g
     * oogle" 时，第一个只出现一次的字符是 "l"。
     * 如果当前字符流没有存在出现一次的字符，返回#字符。
     **/

    private int[] cnts = new int[256];
    private Queue<Character> queue = new LinkedList<>();

    //Insert one char from stringstream
    public void insert(char ch) {
        cnts[ch]++;
        queue.add(ch);
        while (!queue.isEmpty() && cnts[queue.peek()] > 1) {
            queue.poll();
        }
    }

    //return the first appear once char in current stringstream
    public char firstAppearingOnce() {
        return queue.isEmpty() ? '#' : queue.peek();
    }

}
