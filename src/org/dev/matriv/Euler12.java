
package org.dev.matriv;

public class Euler12 {

    public static void main(String args[]) {
        long n = 0;
        int cnt = 0;
        long sqrt = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            n += i;
            cnt = 1;
            sqrt = (long) (Math.sqrt(n) + 1);
            for (long j = 1; j <= sqrt; j++) {
                if (n % j == 0)
                    cnt += 2;
                if (cnt == 501) {
                    System.out.println(n);
                    System.exit(0);
                }
            }
        }
    }
}
