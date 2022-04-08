package Class_04;

import java.util.Random;

public class MethodSample {
	
	public void method01() {
		System.out.println("반환타입은 void이고 매개변수는 없다");
		//호출 후 종료될 때 호출한 위치로 결과를 반환 후 종료
	}
	
	public int method02() {
		System.out.println("반환타입이 int이고 매개변수는 없다");
		// 반환값이 int이기 때문에 return이 있어야 함.
		return 15;
	}
	
	public int[] method03() {
		int[] res = new int[5];
		System.out.println("반환타입은 int[]이고 매개변수가 없는 메서드");
		return res;
	}
	
	public String method04() {
		String res = new String();
		System.out.println("반환타입은 String이고 매개변수가 없는 메서드");
		return res;
	}
	
	public int[] method05(int[] arr) {
		System.out.println("반환타입은 void이고 매개변수는 arr배열");
		System.out.println(arr);
		for(int i = 0; i < arr.length; i++) { //매개변수 arr의 길이만큼 초기화
			System.out.println("arr[" + i + "] -> " + arr[i]); //arr[i]인덱스공간에는 -> 매개변수 arr[i]값 저장
		}
		arr[0] = 10;	arr[1] = 20;	arr[2] = 30; // 만약 메인메서드영역에서 저장한 1 2 3 값이 아닌 다른 값을 저장
		return arr; //위의 값을 반환한다. 반환값 int[]
	}
	
	public void method06(Random r) {
		System.out.println("반환타입은 void이고 매개변수가 클래스(객체)인 메서드");
		r.nextInt(10); // 매개변수 r을 사용하여 랜덤값 생성 ~10 - 전달받은 객체를 사용해서 작업
	}
	
	public void method07(int ... nums) {
		System.out.println("반환타입은 void이고 매개변수가 가변인자인 메서드");
		System.out.println(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "] -> " + nums[i]);
		}
	}
}
