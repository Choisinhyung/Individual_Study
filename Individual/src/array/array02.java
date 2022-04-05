package array;

public class array02 {

	public static void main(String[] args) {
		/*
		 * 크기가 5인 배열을 생성하여 100, 88, 100, 100, 90의 숫자를 저장하고,
		 * 총합과 평균을 구해서 출력하여라
		 */
		
		int score[] = {100, 88, 100, 100, 90};
		int sum = 0;
		float avg = 0f;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		} 
		avg = sum / (float)score.length;
		
		System.out.println("총 점수 : " + sum);
		System.out.println("평균  : " + avg);
		
		/*
		 * 크기가 7인 배열을 생성하여 각 79, 88, 91, 33, 100, 55, 95의 숫자를 저장하고,
		 * 최소값과 최대값을 구하여라
		 */
		
		int[] num = {79, 88, 91, 33, 100, 55, 95};
		int min = num[0];
		int max = num[0];
		
		for(int i = 1; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			} else if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
