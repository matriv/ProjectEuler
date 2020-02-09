/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dev.matriv;

/**
 * @author matriv
 */
public class Euler5 {


    public static void main(String[] args) {
        int a = 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19;
        int[] array = {4, 8, 16};
        for (int i = 0; i < 3; i++)
            while (a % array[i] != 0)
                a *= 2;
        if (a % 9 != 0)
            a *= 3;
        System.out.println(a);
    }
}
