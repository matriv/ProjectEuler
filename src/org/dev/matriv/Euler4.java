package org.dev.matriv;

/**
 * @author matriv
 */
public class Euler4 {

    public static void main(String[] args) {
        int res = 0;
        for (int i = 999; i >= 100; i--)
            for (int j = 999; j >= 100; j--) {
                if (isPal(i * j) && i * j > res)
                    res = i * j;
            }
        System.out.println(res);
    }

    private static boolean isPal(int n) {
        String tmp = n + "";
        StringBuilder sb = new StringBuilder(10);
        for (int i = tmp.length() - 1; i >= 0; i--)
            sb.append(tmp.charAt(i));
        return sb.toString().equals(tmp);

    }
}

