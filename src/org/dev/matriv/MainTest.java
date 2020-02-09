package org.dev.matriv;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: matriv
 * Date: 7/21/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    private static Map<Integer, String> map = new LinkedHashMap<>(10);

    static {
        for (int i = 0; i < 10; i++) {
            map.put(i, "0");
        }
    }
    public static final void main(String args[]) throws InterruptedException {
        Thread1 thread1 = new Thread1(map);
        Thread2 thread2 = new Thread2(map);

        Thread t1 = new Thread(thread1);
        t1.start();
        Thread t2 = new Thread(thread2);
        t2.start();
        Thread.sleep(10000L);
    }
}
