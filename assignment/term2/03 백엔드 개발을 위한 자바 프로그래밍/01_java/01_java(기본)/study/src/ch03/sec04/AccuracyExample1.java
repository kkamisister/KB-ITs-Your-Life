package ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result); // 0.3이 아니다..!
        
        // 부동소수점 연산의 정확도 문제
        // double은 2진수 기반의 부동소수점 방식으로 실수를 저장
        // 0.1이라는 수를 2진수로 정확하게 표현할 수 없음
        // 컴퓨터는 0.1을 0.1000000000...이런식으로 저장함

        // double result = 1 - (7 * 0.1);
        // 이걸,
        // result = 1 - 0.70000000000001 이런식으로 계산

        // 정확한 계산이 필요할 땐 일단 정수로 변환 후 10의 승수로 나누기

    }
}
