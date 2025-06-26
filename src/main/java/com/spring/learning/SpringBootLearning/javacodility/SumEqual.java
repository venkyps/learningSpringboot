package com.spring.learning.SpringBootLearning.javacodility;

public class SumEqual {

    public static int solution(int n){
        int targetDigitSum =digitSum(n);
        int current = n+1;

        while(true){
            if(digitSum(current)==targetDigitSum){
                return current;
            }
            current++;
        }
    }
    private static int digitSum(int num){
        int sum=0;
        while(num > 0){
            sum+=num%10; // module will take remainder(i.e 13/5 result will be 3 as it is remainder)
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("value of 734 :: "+solution(734));
    }
}
