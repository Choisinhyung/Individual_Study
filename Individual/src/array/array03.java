package array;

import java.util.Arrays;
import java.util.Random;

public class array03 {

	public static void main(String[] args) {
		/*
		 * 배열의 요소의 순서를 반복해서 바꾼다(숫자 섞기, 로또번호 생성)
		 */
		
		int[] num = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i < 100; i++) { // 100번 섞는거..!
			int a = (int)(Math.random() * 10); // 0 ~ 9 랜덤 생성
			int tmp = num[0];
			num[0] = num[a];
			num[a] = tmp;
		}
		System.out.println(Arrays.toString(num));
		System.out.println("------------------------------");
		
		
		// 로또번호 6개를 생성하여라 - 코드를 이렇게 짜면 중복값을 배제하는 코드를 또 따로 짜야함..
		// but 배열안에 6이아닌 1~45의 숫자를 넣어 섞는 코드를 짜게 되면 중복값은 없음.
		
		int[] num1 = new int[6];
		
		Random rand = new Random();
		
		for(int i = 0; i < num1.length; i++) {
			num1[i] = rand.nextInt(45) + 1;
			for(int j = 0; j < i; j++) { // 중복제거 코드
				if(num1[i] == num1[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(num1) + "\t");
		System.out.println("------------------------------");		
		
		
		
		// 배열에 1~45저장 후 섞는 법.
		int[] num2 = new int[45]; // index는 0~44
		int a = 0; // 임의의 값을 얻어서 저장할 변수
		int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수
		
		for(int i = 0; i < num2.length; i++) { // num2에 1~45값을 저장
			num2[i] = i + 1;
		} 
		
		for(int i = 0; i < 6; i++) { // 6번반복
			a = (int)(Math.random() * 45); // a에 인덱스 0~44의 임의의 값을 저장
			tmp = num2[i];
			num2[i] = num2[a];
			num2[a] = tmp;
			System.out.println(Arrays.toString(num2) + "\t");
		}
		
		System.out.printf("%d, %d, %d, %d, %d, %d", num2[0], num2[1], num2[2], num2[3], num2[4], num2[5]);
		

	}

}
