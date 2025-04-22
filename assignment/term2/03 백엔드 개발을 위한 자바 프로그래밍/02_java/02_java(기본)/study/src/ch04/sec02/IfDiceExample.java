package ch04.sec02;

import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;

        if (dice == 1) {
            System.out.println("1번이 나왔습니다.");
        }
        if (dice == 2) {
            System.out.println("2번이 나왔습니다.");
        }
        if (dice == 3) {
            System.out.println("3번이 나왔습니다.");
        }
        if (dice == 4) {
            System.out.println("4번이 나왔습니다.");
        }
        if (dice == 5) {
            System.out.println("5번이 나왔습니다.");
        }
        if (dice == 6) {
            System.out.println("6번이 나왔습니다.");
        }
    }
}
