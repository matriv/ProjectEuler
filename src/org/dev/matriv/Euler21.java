package org.dev.matriv;

/**
 * Created with IntelliJ IDEA.
 * User: matriv
 * Date: 1/12/13
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Euler21 {
    public static void main(String[] args) {
        long totalSum = 0;
        for (int a = 1; a <= 10000; a++) {
            long b = 0;
            for (int j = 1; j < a; j++) {
                if (a % j == 0) {
                    b += j;
                }
            }
            if (a != b) {
                long sum2 = 0;
                for (int j = 1; j < b; j++) {
                    if (b % j == 0) {
                        sum2 += j;
                    }
                }
                if (a == sum2) {
                    totalSum += (a);
                }
            }
        }
        System.out.println(totalSum);
    }
    //d(a) = b and d(b) = a, where a ≠ b
}
