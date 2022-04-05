package Object_Instance;

import java.util.Arrays;

public class Class01 {

	public static void main(String[] args) {
		
		Class01[] arr = new Class01[3];
		
		for(int i = 0; i < arr.length; i++) { //012
			arr[i] = new Class01();
			System.out.println(arr[i]);
		}

	}

}
