package Class_04;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		MethodSample m = new MethodSample();
		
		m.method01(); // 메서드 호출
//		System.out.println(m.method01()); // 반환타입이 void이기 때문에 프린트로 출력불가
		
		int r1 = m.method02();
		System.out.println(r1);
		
		int[] res = m.method03();
		int a = 1;
		
		for(int i = 0; i < res.length; i++) {
			res[i] = a;
			a += 1;
			System.out.print(res[i] + " ");
		}
		System.out.println("\n------------------");
		
		String r3 = m.method04();
		
		int[] arg = new int[] {1,2,3}; //arg가 매개변수 arr를 가르키고 1 2 3이 저장 된다
		System.out.println(arg);
		arg = m.method05(arg); // m.method05(arg)에 10 20 30이 저장됨 왜냐면 arr의 값을 반환하니까!
		System.out.println(Arrays.toString(arg)); // 얕은 복사가 아닌 Arrays.toString을 이용해서 깊은 복사 출력!
		
		Random rand = new Random(); // 랜덤객체 생성 후 참조변수인 rand에 대입
		m.method06(rand); // 06메서드를 호출하고 매개변수는 r = rand
		
		m.method07(4,8,6);
		
	}

}
