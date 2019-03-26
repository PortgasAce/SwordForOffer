package com.portgas;

public class Solution005 {

    /**
     * 将一个字符串中的空格替换成 "%20"。
     **/

    public String replaceSpace(StringBuffer str) {
        int before = str.length();
        for (int i = 0; i < before; i++) {
            if (str.charAt(i) == ' ') {
                str.append("12");
            }
        }

        int after = str.length();

        int p1 = before - 1;
        int p2 = after - 1;
        while (p1 >= 0) {
            char c = str.charAt(p1--);
            if (c == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            } else {
                str.setCharAt(p2--, c);
            }
        }

        return str.toString();
    }

    // 耗时比上面的方法高，参考test
    public String replaceSpace2(StringBuffer str) {
        return str.toString().replaceAll(" ", "%20");
    }


}
