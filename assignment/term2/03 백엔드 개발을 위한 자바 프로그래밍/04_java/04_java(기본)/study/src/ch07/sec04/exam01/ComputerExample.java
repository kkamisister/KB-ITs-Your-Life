package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calc = new Calculator();
        System.out.println("원 면적 (by calc) : " + calc.areaCircle(r));

        Computor comp = new Computor();
        System.out.println("원 면적 (by comp) : " + comp.areaCircle(r));
    }
}
