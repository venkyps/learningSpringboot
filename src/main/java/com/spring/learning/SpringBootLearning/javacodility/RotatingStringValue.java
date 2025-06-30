package com.spring.learning.SpringBootLearning.javacodility;

public class RotatingStringValue {

    public static int solution(String value) {
        int N = value.length();
        int count = 0;
        for (int i = 0; i < N; i++) {
            char firstChar = value.charAt(i);
            char lastChar = value.charAt((i+N-1)%N);
            if (firstChar == lastChar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //abbaa should return 3
        //aaaa should return 4
        //abab should return 0
        System.out.println("value of the string rotation " + solution("aaaa"));
    }
}
