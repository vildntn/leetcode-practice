package org.example;

public class ScoreOfString {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += (int) Math.abs(s.charAt(i) + s.charAt(i + 1));
        }
        return score;
    }
}