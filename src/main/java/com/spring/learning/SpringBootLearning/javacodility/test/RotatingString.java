package com.spring.learning.SpringBootLearning.javacodility.test;

public class RotatingString {

    public static int rotateString(String value){
        int count = 0;
        int N=value.length();

        for(int i=0;i<N;i++){
            char firstChar = value.charAt(i);
            char secondChar = value.charAt((i+N-1)%N);
            if(firstChar == secondChar){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //String value = "abbaa";
        //String value = "aaaa";
        String value = "abab";
        System.out.println("value of the rotate string :: "+rotateString(value));
    }
}
