package org.dev.matriv;

/**
 * @author matriv
 */
public class Main {

    public static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29
            , 31, 37, 41, 43, 47, 53, 59, 61, 67, 71
            , 73, 79, 83, 89, 97, 101, 103, 107, 109, 113
            , 127, 131, 137, 139, 149, 151, 157, 163, 167, 173
            , 179, 181, 191, 193, 197, 199, 211, 223, 227, 229
            , 233, 239, 241, 251, 257, 263, 269, 271, 277, 281
            , 283, 293, 307, 311, 313, 317, 331, 337, 347, 349
            , 353, 359, 367, 373, 379, 383, 389, 397, 401, 409
            , 419, 421, 431, 433, 439, 443, 449, 457, 461, 463
            , 467, 479, 487, 491, 499, 503, 509, 521, 523, 541
            , 547, 557, 563, 569, 571, 577, 587, 593, 599, 601
            , 607, 613, 617, 619, 631, 641, 643, 647, 653, 659
            , 661, 673, 677, 683, 691, 701, 709, 719, 727, 733
            , 739, 743, 751, 757, 761, 769, 773, 787, 797, 809
            , 811, 821, 823, 827, 829, 839, 853, 857, 859, 863
            , 877, 881, 883};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n1 = 600851475143l;
        long n2 = 775146;

        for (int i = 775147; i >= 2; i -= 2) {
            if (i % 5 != 0 && n1 % i == 0 && isPrime(i)) {
                System.out.println(i);
                break;
            }

        }

        long dividend = 775146;
        long n = 2;

        while (n < dividend) {
            if (dividend % n == 0) {
                dividend /= n;

            }
            n++;
        }
        System.out.println(n);
    }

    private static boolean isPrime(int n) {
        int max = (int) Math.sqrt(n) + 1;
        for (int i = 1; i < primes.length && primes[i] <= max; i++) {
            if (n % primes[i] == 0)
                return false;
        }
        return true;
    }
}
