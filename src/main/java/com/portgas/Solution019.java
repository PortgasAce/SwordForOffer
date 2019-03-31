package com.portgas;

public class Solution019 {

    /**
     * 请实现一个函数用来匹配包括 '.' 和 '*' 的正则表达式。
     * 模式中的字符 '.' 表示任意一个字符，而 '*' 表示它前面
     * 的字符可以出现任意次（包含 0 次）。
     * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，
     * 字符串 "aaa" 与模式 "a.a" 和 "ab*ac*a" 匹配，但是
     * 与 "aa.a" 和 "ab*a" 均不匹配。
     **/

    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        return matchTwoStr(str, 0, pattern, 0);
    }

    private boolean matchTwoStr(char[] str, int strIndex, char[] pattern, int patternIndex) {
        // str到尾，pattern到尾，匹配成功
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }

        // str到尾，pattern未到尾，除非pattern剩余部分均为 a* ，否则匹配失败
        if (strIndex == str.length /* && patternIndex != pattern.length */) {
            while (patternIndex != pattern.length) {
                // 找到非*位，判断后一位是否越界 或者 不为* ，则匹配失败
                if (pattern[patternIndex] != '*' && (patternIndex + 1 >= pattern.length || pattern[patternIndex + 1] != '*')) {
                    return false;
                }
                patternIndex++;
            }
            return true;
        }

        // str未到尾，pattern到尾，匹配失败
        if (/* strIndex != str.length && */ patternIndex == pattern.length) {
            return false;
        }

        // pattern 剩最后一位需要比对
        if (patternIndex + 1 == pattern.length) {
            if (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')
                return matchTwoStr(str, strIndex + 1, pattern, patternIndex + 1);
            else {
                return false;
            }
        }

        // 当前 strIndex 与 patternIndex 匹配，且后一位不是 * ，则 都后移一位
        if ((str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.') && pattern[patternIndex + 1] != '*') {
            return matchTwoStr(str, strIndex + 1, pattern, patternIndex + 1);
        }

        // 当前 strIndex 与 patternIndex 匹配，且后一位是 * ，则
        // 1)：* 号继续匹配，strIndex+1
        // 2): * 号匹配结束，patternIndex+2
        if ((str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.') && pattern[patternIndex + 1] == '*') {
            return matchTwoStr(str, strIndex, pattern, patternIndex + 2)
                    || matchTwoStr(str, strIndex + 1, pattern, patternIndex);
        }

        // 当前位不匹配，且后一位为* ，* 匹配到0个字符，跳过 +2
        if (pattern[patternIndex + 1] == '*') {
            return matchTwoStr(str, strIndex, pattern, patternIndex + 2);
        }
        return false;
    }

}
