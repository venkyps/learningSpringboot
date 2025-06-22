package com.spring.learning.SpringBootLearning.javacodility;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FairIndex {

    public static int solution(int[] A, int[] B) {
        int n = A.length;
        return (int) IntStream.range(0, n - 1)
                .filter(k -> {
                    int sumA_left = Arrays.stream(A, 0, k + 1).sum();
                    int sumA_right = Arrays.stream(A, k + 1, n).sum();
                    int sumB_left = Arrays.stream(B, 0, k + 1).sum();
                    int sumB_right = Arrays.stream(B, k + 1, n).sum();
                    return sumA_left == sumA_right && sumB_left == sumB_right && sumA_left == sumB_left;
                })
                .count();
    }

    public static void main(String[] args) {

        int a[] ={0,4,-1,0,3};
        int b[]={0,-2,5,0,3};

        System.out.println(solution(a,b));

    }
}
