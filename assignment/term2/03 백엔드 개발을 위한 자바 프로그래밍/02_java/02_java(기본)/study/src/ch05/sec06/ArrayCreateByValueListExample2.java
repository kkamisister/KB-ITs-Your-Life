package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
//        int[] scores = new int[] { 83, 90, 87 };
        int[] scores;
        scores = new int[] { 83, 90, 87 };
        int sum1 = 0;
        for(int i=0; i<3; i++) {
            sum1 += scores[i];
        }
        printItem( new int[] { 83, 90, 87 } );
    }
    public static void printItem( int[] scores ) {
        for(int i = 0; i<=2; i++) {
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }
}
