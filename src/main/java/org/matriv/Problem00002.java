package org.matriv;

public final class Problem00002 {

    public static int sumOfEvenFibonacci(int limit) {
        int a = 1;
        int b = 2;
        int sum = 0;

        while (b < limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            int tmp = b;
            b += a;
            a = tmp;
        }
        return sum;
    }
}
