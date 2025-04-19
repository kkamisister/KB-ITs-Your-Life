package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in : 키보드로부터 입력 받도록 함

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine(); // nextLine()으로 입력받음
        int x = Integer.parseInt(strX);   // 입력받은 문자열을 정수형 변환

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        while(true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")) {      // 입력받은 데이터가 'q'이면
                break;                  // 종료
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }

        System.out.println("종료");

    }
}
