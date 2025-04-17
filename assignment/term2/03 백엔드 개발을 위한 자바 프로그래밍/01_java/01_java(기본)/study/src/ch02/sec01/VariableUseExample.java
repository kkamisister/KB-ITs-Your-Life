package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        // hour과 minute x시간 x분 형태로 출력
        System.out.println(hour + "시간 " + minute + "분");

        int totalMinutes = hour * 60 + minute; // hour*60 -> 분으로 변환
        // 총 분 출력
        System.out.println("총 " + totalMinutes + "분");
    }
}
