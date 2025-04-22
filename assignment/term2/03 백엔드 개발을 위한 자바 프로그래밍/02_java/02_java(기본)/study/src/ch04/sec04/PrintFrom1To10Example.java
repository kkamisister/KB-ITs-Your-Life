package ch04.sec04;

public class PrintFrom1To10Example {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i); // 한 개 출력하고 줄바꿈
            System.out.print(i + " ");
        }
    }
}
