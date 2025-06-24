package com.spring.learning.SpringBootLearning.javacodility;

import java.util.*;

public class TwoDifferentNumbers {
    public static int solution(int[] a) {

        Map<String, List<Integer>> map = new HashMap<>();
        for (int b : a) {
            String value = getStringVal(b);
            map.putIfAbsent(value, new ArrayList<>());
            map.get(value).add(b);
        }
        int maxSum = -1;
        for (List<Integer> list : map.values()) {
            if (list.size() >= 2) {
                list.sort(Collections.reverseOrder());
                int sum = list.get(0) + list.get(1);
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static String getStringVal(int value) {
        int lastValue = value % 10;
        int firstValue = value;
        while (firstValue >= 10) {
            firstValue /= 10;
        }
        return firstValue + "-" + lastValue;
    }

    public static void main(String[] args) {
        int[] A = {130, 191, 200, 10};
        System.out.println(solution(A));
    }
}
