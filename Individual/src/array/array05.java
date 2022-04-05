package array;

import java.util.Arrays;

public class array05 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열
		 * 
		 * 2차원 배열을 생성하여 모든 값을 더하여라
		 */
		
		int[][] arr = {     // 배열 생성 완
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
		System.out.println("--------------------------");
		
		/*
		 * 총점과 평균구하기
		 */
		
		int[][] score = {
							{100,100,100},
							{20,20,20},
							{30,30,30},
							{40,40,40},
							{50,50,50}
						};
		System.out.println("번호 국어 영어 수학 총점 평균");
		
		int korean = 0, eng = 0, math = 0;

		for(int i = 0; i < score.length; i++) {
			
			int sum1 = 0;
			float avg = 0f;
			
			korean += score[i][0];
			eng += score[i][1];
			math += score[i][2];
			
			System.out.printf("%3d", i+1);
			
			for(int j = 0; j < score[i].length; j++) {
				sum1 += score[i][j];
				System.out.printf("%4d",score[i][j]);
			} 
			avg = sum1 / (float)score[i].length;
			System.out.println(" " + sum1 + " " +avg);
		}
		System.out.println("--------------------------");
		System.out.printf("총점 %3d %3d %3d", korean, eng, math);
		
		
		

	}

}
