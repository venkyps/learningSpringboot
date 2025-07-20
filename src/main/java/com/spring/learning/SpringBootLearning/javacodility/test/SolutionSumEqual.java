package com.spring.learning.SpringBootLearning.javacodility.test;

public class SolutionSumEqual {
    public int solution(int N) {
        int sum = digitSum(N);
        int current = N+1;
        while(true){
            if(sum == digitSum(current)){
                return current;
            }
            current++;
        }
    }

    public int digitSum(int N){
        int sum =0;
        while(N>0){
            sum+=N%10;
            N/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SolutionSumEqual solutionSumEqual = new SolutionSumEqual();
        //int value = 28; 37
        //int value = 734; 743
        int value = 50000; //100004
        System.out.println("value of sum equal :: "+solutionSumEqual.solution(value));

    }
}
