package array;

import java.util.Arrays;
import java.util.Random;

public class array01 { // 2022.03.16

	public static void main(String[] args) {

		// 크기 10인 배열 10~1까지의 값으로 초기화
		
		int[] arr = new int[10];
		int init = 10;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = init--;;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		// 크기 10인 배열 선언 후 2~ 짝수값에 해당하는 값으로 초기화
		
		int[] arr1 = new int[10];
		int init2 = 2;
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = init2;
			init2 += 2;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		// 크기5인 실수배열 선언 후 1~0.5씩 증가된 값으로 초기화
		
		double[] arr2 = new double[5];
		double init3 = 1.0;
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = init3;
			init3 += 0.5;
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// 크기가 5인 문자배열 'A'~'E'까지의 문자값으로 초기화
		
		char[] arr3 = new char[5];
		char init4 = 'A';
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = init4;
			init4 += 1;
			System.out.print(arr3[i] + " ");
		}
		
	}

}
