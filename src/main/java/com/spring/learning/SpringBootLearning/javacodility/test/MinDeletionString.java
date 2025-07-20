package com.spring.learning.SpringBootLearning.javacodility.test;

public class MinDeletionString {

    public int solution(String s){
        int minDeletion=0;
        int countB = 0;
        for(char c : s.toCharArray()){
            if(c == 'A'){
                minDeletion = Math.min(minDeletion+1,countB);
            }else{
                countB++;
            }
        }
        return minDeletion;
    }

    public static void main(String[] args) {
        MinDeletionString minDeletionString = new MinDeletionString();
        //String value = "BAAABAB"; 2
        //String value = "BBABAA"; 3
        String value ="AABBBB";
        System.out.println("value of the min deletion "+minDeletionString.solution(value));
    }
}
