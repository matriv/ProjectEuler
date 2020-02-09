package org.dev.matriv;

import java.io.BufferedReader;
import java.io.FileReader;

public class Euler18 {

    public static void main(String[] args) throws Exception {
        if (args.length != 1 ) {
            System.err.println("Number of arguments should be 1");
        }
        String filename = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = null;
        int lines = 0;
        String lastLine = null;
        while ((line = reader.readLine()) != null) {
            lines++;
            lastLine = line;
        }
        String[] parts = lastLine.split("\\s");
        int[][] triangle = new int[lines][parts.length];
        reader.close();
        lines = 0;
        reader = new BufferedReader(new FileReader(filename));
        while ((line = reader.readLine()) != null) {
            String[] numbers = line.split("\\s");
            for (int i = 0; i < numbers.length; i++) {
                triangle[lines][i] = Integer.parseInt(numbers[i]);
            }
            lines++;
        }


        // Algorithm
        for (int i = lines - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
            }
        }
        System.out.println(triangle[0][0]);

    }

}
