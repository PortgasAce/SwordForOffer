package com.portgas;

public class Solution016 {

    /**
     * 数值的整数次方：
     * 给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent，求 base 的 exponent 次方。
     **/

    public double power(double base, int exponent) {
        if (base == 0.0 && exponent < 0)
            return 0.0;
        int abs = Math.abs(exponent);
        double result = pow(base, abs);
        if (exponent < 0)
            return 1 / result;
        return result;
    }

    private double pow(double base, int abs) {
        if (abs == 0)
            return 1.0;
        if (base == 1.0)
            return base;

        double re = pow(base, abs >> 1);
        re *= re;
        // abs为奇数时 * base
        if ((abs & 1) == 1)
            return re * base;
        return re;
    }

    public double power2(double base, int exponent) {
        return Math.pow(base, exponent);
    }

}
