package array;

import java.util.Arrays;

public class array07 {

	public static void main(String[] args) {
		// 크기가 5인 배열을 생성하고 출력해라
		int[] arr = new int[5]; // 배열 5생성
		
		
		for(int i = 0; i < arr.length; i++) { //arr의 길이만큼 반복 - 0 1 2 3 4
			arr[i] = i * 10; //배열 arr의 인덱스 번호가 0일 때 arr의 0번째 인덱스에 0 * 10을 저장 = 0 / 1번째는 10 20 30 40  
			System.out.println(arr[i]);
		}
		
		
		//1~10의 숫자를 순서대로 배열에 저장하고 출력해라
		int[] arr1 = new int[10]; // 0~9
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.println(arr1[i]);
		}
		
		// 1 ~ 10까지의 난수를 배열에 저장하고 출력해라
		
		int[] arr2 = new int[10];
//		Random rand = new Random();
//		int a = rand.nextInt();
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random() * 10) + 1; //1부터 시작해야하기 때문에 +1을 해주고 Math.random값에 10을 입력하여 출력한다.
		}
		System.out.println(Arrays.toString(arr2)); //배열에 저장된 값을 문자열로 출력하는 메서드
		
		/*
		 * 크기가 5인 배열을 생성하여 100, 88, 100, 100, 90의 숫자를 저장하고,
		 * 총합과 평균을 구해서 출력하여라
		 */
		
		int[] arr3 = {100, 88, 100, 100, 90};
		
		int sum = 0;
		float avg = 0f;
		
		for(int i = 0; i < arr3.length; i++) { // 0 1 2 3 4
			sum += arr3[i];
		}
		
		avg = sum / (float)arr3.length;
		
		System.out.println(sum);
		System.out.println(avg);
		
		/*
		 * 크기가 7인 배열을 생성하여 각 79, 88, 91, 33, 100, 55, 95의 숫자를 저장하고,
		 * 최소값과 최대값을 구하여라
		 */
		
		int[] num = {79, 88, 91, 33, 100, 55, 95};
		
		int min = num[0];
		int max = num[0];
		
		for(int i = 1; i < num.length; i++) {
			if(num[i] > max) { //만약 num i번째 값이 max보다 클 경우 맥스에 num을 저장
				max = num[i];
			} else if(num[i] < min) {
				min = num[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
	

}
