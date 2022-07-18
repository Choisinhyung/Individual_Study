package study;

import java.util.Arrays;

public class lotto {

	public static void main(String[] args) {
		int[] ball = new int[45]; // 0 ~ 44인덱스의 배열 생성

		// 배열에 1~45의 숫자 저장하기 
		for ( int i = 0; i < ball.length; i++ ) {
			ball[i] = i + 1;    // 저장 완료
		}

		int tmp = 0; // 두 값을 바꾸는데 사용할 변수
		int j = 0;  // 임의의 값을 얻어서 저장할 변수

		//랜덤으로 숫자 섞기 0 ~ 5번째 인덱스
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);  //  0~44의 값을 j에 저장.. 왜...? 45는...? 이렇게 하면 0 ~ 44숫자가 랜덤으로되는게 아닌감...아닌가...........
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		System.out.println(Arrays.toString(ball));
		
		for(int i = 0; i < 6; i++) {
			System.out.print(ball[i] + ", ");
		}
	}

}
