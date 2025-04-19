package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {

        // 기본타입 & 문자열 간 형변환 ERROR
        // Java는 기본타입 & 문자열 간에 casting(형 변환ㄴ) 불가
        // 기본형끼리는 가능
        // 문자열은 참조타입. 참조 타입 <-> 기본타입 간에는 불가
//        int value1 = (int) ("10");
//        double value2 = (double) ("3.14");
//        boolean value3 = (boolean) ("true");

        // 명시적인 메서드를 사용해야 가능
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        // 마찬가지로 기본 타입 -> 참조타입인 String으로 강제 형변환 불가.
//        String str1 = (String) (10);
//        String str2 = (String) (3.14);
//        String str3 = (String) (true);

        // 명시적인 메서드 사용해야 가능
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }

}
