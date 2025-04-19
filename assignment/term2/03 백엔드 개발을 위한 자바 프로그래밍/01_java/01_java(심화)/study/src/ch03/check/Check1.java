package ch03.check;

public class Check1 {
    public static void main(String[] args) {
        int top = 5;
        int bottom = 10;
        int height = 7;

        // 오답 : 이미 정수끼리의 연산 이후에 (52) 실수 형변환을 하기 때문에, 52.0이 나옴
//        double area = (double) ((top + bottom) * height / 2);

        // 정답 : 나누기 전에 형변환 필요
//        double area = ((top + bottom) * height) / 2.0;
        double area = (double)(top + bottom) * height / 2;

        System.out.println(area);
    }

}
