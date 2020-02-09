package org.dev.matriv;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by matriv on 5/6/14.
 */
public class Thread1 implements Runnable {

    private Map<Integer, String> map;

    public Thread1(final Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (short k = 0; k < 10000; k++) {
            for (int i = 0; i < 1000; i++) {

                if (k % 2 == 0) {
                    this.map.put(((int)Math.abs(Math.pow(i,2.5)) % 100), (i * (int)Math.abs(Math.pow(i,2.5)) % 100) + "");
                } else {
                    this.map.put(i, "a");
                }
            }
            System.out.println("");
        }
    }
}