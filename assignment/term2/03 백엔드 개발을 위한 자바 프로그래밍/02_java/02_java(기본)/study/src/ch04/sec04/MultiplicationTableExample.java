package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            // 단 시작 구분
            System.out.println("*** " + i + "단 ***");
            for (int j = 1; j <= 9; j++) {
                int multiplication = i * j;
                System.out.println(i + " x " + j + " = " + multiplication);
            }
            System.out.println();
        }
    }
}
