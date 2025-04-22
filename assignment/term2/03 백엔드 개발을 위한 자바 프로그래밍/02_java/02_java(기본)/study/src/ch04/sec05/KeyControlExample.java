package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        int speed = 0;

        while (data != null) {
            System.out.println("-------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지 ");
            System.out.println("-------------------------");


            if (data.equals("1")) {
                speed++;
                System.out.println("선택: 1");
                System.out.println("현재 속도 = " + speed);
            } else if (data.equals("2")) {
                speed--;
                System.out.println("선택: 2");
                System.out.println("현재 속도 = " + speed);
            } else {
                System.out.println("선택: 3");
                System.out.println("프로그램 종료1");
                break;
            }
            data = sc.nextLine();
        }
//        Scanner scanner = new Scanner(System.in);
//        boolean run = true;
//        int speed = 0;
//
//        while(run) {
//            System.out.println("-----------------------------");
//            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
//            System.out.println("-----------------------------");
//            System.out.print("선택: ");
//
//            String strNum = scanner.nextLine();
//
//            if(strNum.equals("1")) {
//                speed++;
//                System.out.println("현재 속도 = " + speed);
//            } else if(strNum.equals("2")) {
//                speed--;
//                System.out.println("현재 속도 = " + speed);
//            } else if(strNum.equals("3")) {
//                run = false;
//            }
//        }
//
//        System.out.println("프로그램 종료");

    }
}
