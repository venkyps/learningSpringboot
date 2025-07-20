package com.spring.learning.SpringBootLearning.javacodility.test;

import java.util.*;

public class SolutionMaxSumEqual {
    public int solution(int a[]){
        Map<String, List<Integer>> map = new HashMap<>();
        int max=-1;
        for(int b:a){
            String value = getDigit(b);
            map.putIfAbsent(value,new ArrayList<>());
            map.get(value).add(b);
        }

        for(List<Integer> list: map.values()){
            if(list.size()>=2){
                list.sort(Collections.reverseOrder());
                int sum = list.get(0)+list.get(1);
                max=Math.max(max,sum);
            }
        }
        return max;
    }
    public String getDigit(int value){
        int firstValue=value;
        int lastValue=value%10;
        while(firstValue>=10){
            firstValue/=10;
        }
        return firstValue+"-"+lastValue;
    }

    public static void main(String[] args) {
        SolutionMaxSumEqual solutionMaxSumEqual = new SolutionMaxSumEqual();

        int a[]={130,191,200,10,11};
        System.out.println("value of the mex :: "+solutionMaxSumEqual.solution(a));
    }
}
