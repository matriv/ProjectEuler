package org.matriv;

public final class Problem00001 {

    public static int sumOf3And5MultiplesBelow(int limit) {
        int sum = 0;

        for (int i = 1; i < limit; i++) {
            String str = String.valueOf(i);
            char lastChar = str.charAt(str.length() - 1);
            if (lastChar == '0' || lastChar == '5') {
                sum += i;
            } else if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
