package org.dev.matriv;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: matriv
 * Date: 7/21/13
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Euler15 {
    public static final void main(String args[]) {
        BigInteger bi = BigInteger.valueOf(2);
        bi = bi.pow(1000);
        String s = bi.toString();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.charAt(i) + "");
        }
        System.out.println(bi);
        System.out.println(sum);
    }
}
