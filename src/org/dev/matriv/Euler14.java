/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dev.matriv;

/**
 * @author matriv
 */
public class Euler14 {
    public static void main(String[] args) {
        long chain = 0;
        long max = 0;
        for (long i = 1; i < 1000000; i++) {
            chain = 1;
            long n = i;
            do {
                n = f(n);
                chain++;
            } while (n != 1);
            if (chain > max) {
                max = chain;
                System.out.println(i);
            }
        }

    }

    public static long f(long n) {
        if (n % 2 == 0)
            return n / 2;
        else
            return 3 * n + 1;
    }
}
