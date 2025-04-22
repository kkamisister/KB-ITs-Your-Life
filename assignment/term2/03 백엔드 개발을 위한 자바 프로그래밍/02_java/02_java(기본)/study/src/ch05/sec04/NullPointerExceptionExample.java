package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10; // intArray가 참조하는 배열 객체가 없으므로 10을 저장할 수 없어서 error

        String str = null;
        System.out.println("총 문자 수: " + str.length() ); // str 변수가 참조하는 String 객체가 없으므로 error
    }
}
