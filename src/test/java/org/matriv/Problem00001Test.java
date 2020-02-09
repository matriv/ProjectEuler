package org.matriv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem00001Test {

    @Test
    public void sumOfEvenFibonacciBelow4M() {
        assertEquals(4613732, Problem00002.sumOfEvenFibonacci(4_000_000));
    }

}
