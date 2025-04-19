package ch02.sec12;

public class PringExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);       // %d 자리에 정수 출력
        System.out.printf("상품의 가격:%6d원\n", value);      // 정수 6칸 확보, 우측 정렬
        System.out.printf("상품의 가격:%-6d원\n", value);     // 정수 6칸 확보, 좌측 정렬
        System.out.printf("상품의 가격:%06d원\n", value);     // 정수 6칸 확보, 빈칸은 0으로 채움

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%.2f\n", 10, area);   // %.2f : 소수점 둘쨰자리까지 실수 출력

        String name = "홍길동";
        String job = "도적";
        // 문자열 6칸 확보, 좌측 / 우측 정렬
        System.out.printf("%3d|%-6s|%6s\n", 1, name, job);
    }
}
