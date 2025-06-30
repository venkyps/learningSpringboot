package com.spring.learning.SpringBootLearning.javacodility;

public class DeleteMinimumCharacters {

    public static int minimumCharacterDeletion(String value) {
        int countA = 0;
        int countB = 0;
        int minDeletion = 0;

        for (char c : value.toCharArray()) {
            if ('A' == c) {
                countA++;
            }
        }
        minDeletion = countA;

        for (char c : value.toCharArray()) {
            if ('B' == c) {
                countB++;
            } else {
                countA--;
            }
            minDeletion = Math.min(minDeletion, countA + countB);
        }
        return minDeletion;
    }

    public static void main(String[] args) {
        // BAAABAB to AAABB
        System.out.println("value of the deletion  "+minimumCharacterDeletion("BAAABAB"));
    }
}
