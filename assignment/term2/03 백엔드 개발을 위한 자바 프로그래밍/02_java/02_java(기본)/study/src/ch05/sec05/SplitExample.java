package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board =  "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        String[] splitted = board.split(",");

        System.out.println("번호: " + splitted[0]);
        System.out.println("제목: " + splitted[1]);
        System.out.println("내용: " + splitted[2]);
        System.out.println("성명: " + splitted[3]);

        for (int i = 0; i < splitted.length; i++) {
            System.out.println(splitted[i]);
        }
    }
}
