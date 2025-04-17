package ch03.sec01;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        // byte 범위는 -128 ~ 127
        byte var1 = 125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            var1++; //++ 연산은 var1의 값을 1 증가시킨다.

            // 127에서 +1되어 128이 되면, 범위를 벗어나므로 256을 뺀 -128이 됨
            System.out.println("var1: " + var1);
        }

        System.out.println("-----------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            var2--; //-- 연산은 var2의 값을 1 감소시킨다.

            // -128에서 -1이 되어 -129가 되면, 범위를 벗어나므로 256을 더한 127이 됨
            System.out.println("var2: " + var2);
        }
    }
}
