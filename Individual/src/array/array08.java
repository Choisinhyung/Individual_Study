package array;

public class array08 {

	public static void main(String[] args) {
		/*
		 * 배열 arr에 담긴 값을 모두 더하여라
		 */
		
		int[] arr = {10,20,30,40,50};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum=" + sum);
		
		
		/*
		 * 2차원배열에 담긴 모든 값의 총합과 평균을 구하여라
		 */
		
		int[][] arr1 = {
				{5,5,5,5,5}, 
				{10,10,10,10,10}, 
				{20,20,20,20,20}, 
				{30,30,30,30,30} 
		};
		
		int sum1 = 0;
		float avg = 0;
		
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				sum1 += arr1[i][j];
			}
		}
		System.out.println(sum1); // 325
		
		avg = sum1 / (float)(arr1.length * arr1[0].length);
		System.out.println(avg); // 

	}

}
