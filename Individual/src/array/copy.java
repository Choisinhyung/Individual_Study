package array;

public class copy {

	public static void main(String[] args) {
		
		//arrays.copy - deepcopy
		
		int n1 = 10;
		int n2 = n1;
		
		System.out.println(n1 + n2);
		
		//
		n1 += 1;
		n2 += 2;
		
		System.out.printf("%d -> %d", n1, n2);
		
		System.out.println();
		
		//
		int[] arr = new int[5];
		int init = 1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = init;
			init += 1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int[] arr1 = arr;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		 
		
		
		
		

	}

}
