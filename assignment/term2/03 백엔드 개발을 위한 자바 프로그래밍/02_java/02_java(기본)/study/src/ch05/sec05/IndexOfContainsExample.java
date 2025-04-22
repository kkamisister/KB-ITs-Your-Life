package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        // 1) 언어 부분 추출 후 "자바"인지 여부 판별
        String language = subject.substring(0, location-1);
        if (language.equals("자바")) {
            System.out.println("1) 자바와 관련된 책이군요.");
        }

        // 2) indexOf 판별
        int index = subject.indexOf("자바");
        if (index != -1) {
            System.out.println("2) 자바와 관련된 책이군요.");
        } else System.out.println("자바와 관련이 없는 책이군요.");

        // 3) contains() 판별
        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("3) 자바와 관련된 책이군요,");
        } else System.out.println("자바와 관련이 없는 책이군요.");

    }
}
