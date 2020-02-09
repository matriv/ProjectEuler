package org.dev.matriv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by matriv on 5/6/14.
 */
public class Thread2 implements Runnable {

    private Map<Integer, String> map;

    public Thread2(final Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try (FileWriter fw = new FileWriter("/tmp/" + Thread.currentThread().getName());
             PrintWriter out = new PrintWriter(new BufferedWriter(fw))) {
            for (int i = 0; i < 10000; i++) {
//                for (Map.Entry<Integer, String> entry : this.map.entrySet()) {
//                    out.print(entry.getKey() + ":" + entry.getValue() + ", ");
//                }
                out.println(this.map.size());
            }
        } catch (IOException e) {}
    }
}