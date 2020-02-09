package org.dev.matriv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public final class Euler22 {

    public static void main(String[] args) throws IOException {
        Map<Character, Integer> alphabet = new HashMap<>();
        alphabet.put('a', 1);
        alphabet.put('b', 2);
        alphabet.put('c', 3);
        alphabet.put('d', 4);
        alphabet.put('e', 5);
        alphabet.put('f', 6);
        alphabet.put('g', 7);
        alphabet.put('h', 8);
        alphabet.put('i', 9);
        alphabet.put('j', 10);
        alphabet.put('k', 11);
        alphabet.put('l', 12);
        alphabet.put('m', 13);
        alphabet.put('n', 14);
        alphabet.put('o', 15);
        alphabet.put('p', 16);
        alphabet.put('q', 17);
        alphabet.put('r', 18);
        alphabet.put('s', 19);
        alphabet.put('t', 20);
        alphabet.put('u', 21);
        alphabet.put('v', 22);
        alphabet.put('w', 23);
        alphabet.put('x', 24);
        alphabet.put('y', 25);
        alphabet.put('z', 26);

        String totalNames = Pattern.compile("\"").matcher(readFile()).replaceAll("").toLowerCase();
        String[] namesStr = totalNames.split(",");
        List<String> names = Arrays.asList(namesStr);
        Collections.sort(names);
        int i = 1;
        long sum = 0;
        for (final String name : names) {
            int charSum = 0;
            for (int j = 0; j < name.length(); j++) {
                char c = name.charAt(j);
                if (alphabet.get(c) == null) {
                    System.out.println("'" + c + "'");
                } else {
                    charSum += alphabet.get(c);
                }
            }
            sum += (charSum * i);
            i++;
        }
        System.out.println(sum);
    }


    static String readFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("names.txt"))) {
            StringBuilder sb = new StringBuilder(10000);
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append('\n');
                line = br.readLine();
            }
            return sb.toString();
        }
    }
}
