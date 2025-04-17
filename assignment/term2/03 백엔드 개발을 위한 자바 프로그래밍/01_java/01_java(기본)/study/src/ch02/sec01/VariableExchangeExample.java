package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x; // temp 변수에 x값 3을 배정
        x = y; // y값 5를 변수 x에 배정
        y = temp; // y값에 temp 변수 값 3을 배정
        System.out.println("x:" + x + ", y:" + y);
    }
}
