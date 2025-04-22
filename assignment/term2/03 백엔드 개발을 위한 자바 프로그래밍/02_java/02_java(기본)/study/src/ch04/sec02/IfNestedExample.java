package ch04.sec02;

import java.util.Random;

public class IfNestedExample {
    public static void main(String[] args) {
        Random rand = new Random();

        int score = rand.nextInt(20)+81;
        System.out.println("점수: " + score);

        String grade = "";
        if (score >= 95) {
            grade = "A+";
        }
        if (90 <= score && score < 95) {
            grade = "A";
        }
        if (85 <= score && score < 90) {
            grade = "B+";
        }
        if (81 <= score && score < 85) {
            grade = "B";
        }

        System.out.println("학점: " + grade);
    }
}
