package ch11.sec02.exam01;

public class ExceptinoHandlingExample1 {
//    public static void printLength(String data) {
//        int result = data.length();
//        System.out.println("문자 수: " + result);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("[프로그램 시작]\n");
//        printLength("ThisIsJava");
//        printLength(null); // 매개변수 data에 null값이 대입되며, NullPinterException 발생
//        System.out.println("[프로그램 종료]");
//    }

    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            // 예외 메시지 출력
            System.out.println(e.getMessage());
            // 스택 추적 내용 출력
            e.printStackTrace();
        } finally {
            System.out.println("[마무리 실행]\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // 예외 발생
        System.out.println("[프로그램 종료]");
    }
}