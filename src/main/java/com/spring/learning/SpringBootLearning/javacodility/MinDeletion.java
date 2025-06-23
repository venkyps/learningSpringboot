package com.spring.learning.SpringBootLearning.javacodility;

public interface MinDeletion {
    public static int solution(String S) {
        int countB = 0;
        int minDeletions = 0;

        for (char c : S.toCharArray()) {
            if (c == 'A') {
                // Either delete this A, or delete all previous Bs
                minDeletions = Math.min(minDeletions + 1, countB);
            } else {
                // It's a B; keep count
                countB++;
            }
        }

        return minDeletions;
    }

    public static void main(String[] args) {
        System.out.println("value of the string :: "+solution("BBABAA"));
    }


}
