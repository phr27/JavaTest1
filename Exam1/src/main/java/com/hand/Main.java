package com.hand;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static boolean isPrimers(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> getPrimers(int min, int max) {
        if (min < 2) {
            min = 2;
        }

        if (max < 2) {
            max = 2;
        }

        List<Integer> result = new ArrayList<>();
        while (min <= max) {
            if (isPrimers(min)) {
                result.add(min);
            }
            min++;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = getPrimers(101, 200);
        final StringBuilder resultBuilder = new StringBuilder("101-200间总共有");
        resultBuilder.append(result.size()).append("个素数，分别是:");
        result.stream().forEach(p -> resultBuilder.append(p).append(","));
        resultBuilder.setLength(resultBuilder.length() - 1);

        System.out.println(resultBuilder);
    }
}
