package ch05.sec06;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		// int 배열 생성 (기본값 : 0)
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println();

		// 배열에 값 대입
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		for(int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println("\n");

		// double형 배열 생성 (기본값 : 0.0)
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();

		// 배열에 값 대입
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;

		for(int i=0; i<3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");

		// String 배열 생성 (기본값 : null)
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();

		// 배열에 값 대입
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";

		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
	}
}
