package array;

import java.util.Arrays;
import java.util.Random;

public class array04 {

	public static void main(String[] args) {
		/*
		 * String배열
		 * 배열을 생성하고 가위, 바위, 보 값을 저장하여 랜덤으로 출력하시오
		 */
		
		String[] game = {"가위", "바위", "보"}; // 배열 생성 및 초기화 0 1 2 
		int a = 0;
		
		Random rand = new Random(); // 랜덤값 생성
		
		for(int i = 0; i < game.length; i++) { // game길이만큼 반복해라 0 1 2
			a = rand.nextInt(game.length); // int a에 0 1 2 저장
			System.out.println(game[a]);
		}
			
		
		

	}

}
