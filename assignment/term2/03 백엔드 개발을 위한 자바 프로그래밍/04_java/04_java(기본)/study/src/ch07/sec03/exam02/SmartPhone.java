package ch07.sec03.exam02;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {

        // model, color는 SmartPhone 클래스의 생성자 매개변수로 초기화
        super(model, color);
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
