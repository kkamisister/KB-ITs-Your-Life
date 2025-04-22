package ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // SmartPhone 객체 myPhone 생성
        SmartPhone myPhone = new SmartPhone("iphone", "blue");

        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
    }
}
