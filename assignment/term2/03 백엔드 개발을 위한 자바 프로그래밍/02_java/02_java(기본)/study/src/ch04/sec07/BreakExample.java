package ch04.sec07;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {
            Random r = new Random();
            int randomNum = r.nextInt(6)+1;
            System.out.println(randomNum);

            if (randomNum == 6) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
