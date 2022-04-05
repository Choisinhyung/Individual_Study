package array;

import java.util.Arrays;
import java.util.Random;

public class array01 { // 2022.03.16

	public static void main(String[] args) {

		// 크기가 5인 배열을 생성하고 출력해라
		
		int[] arr1 = {10,20,30,40,50};
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\n1번 -> " + Arrays.toString(arr1));
		
		
		//1~10의 숫자를 순서대로 배열에 저장하고 출력해라
		
		int[] arr2 = new int[10];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i + 1;
		}
		System.out.print("\n2번 -> " + Arrays.toString(arr2));
		
		// 1 ~ 10까지의 난수를 배열에 저장하고 출력해라
		
		int[] arr3 = new int[10];
		
//		Random rand = new Random(10);
		for(int i = 0; i < arr3.length; i++) {
//			arr3[i] = rand.nextInt(10) + 1;
			arr3[i] = (int)(Math.random() * 10) + 1;
		}
		System.out.print("\n3번 -> " + Arrays.toString(arr3));

	}

}
