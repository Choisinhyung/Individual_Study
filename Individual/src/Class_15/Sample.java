package Class_15;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {
	
	
	public void ex01() {
		/*
		 * 사용자 입력으로 정수값 입력을 받을 때 한번의 입력으로 1개 이상의 정수값을
		 * 받을 수 있도록 한다.(nextLine() 메서드를 사용해야 함)
		 * 
		 * 예)
		 *     정수값 입력 : 10 20 30 40 50
		 *     
		 *     다음의 값을 입력하였습니다.
		 *     10, 20, 30, 40, 50
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 -> ");
		String num = sc.nextLine();
		
		String[] numArr = num.split(" ");
//		System.out.println(Arrays.toString(numArr));
		
		System.out.println("다음의 값을 입력하였습니다. ");
		System.out.println(String.join(", ", numArr));
	}
	
	public void ex02() {
		/*
		 * 사용자 입력으로 전화번호를 입력 받을 때 xxx-xxxx-xxxx 형식으로 입력하지 않은 경우 다시 입력하도록 한다.
		 */
		Scanner s = new Scanner(System.in);
		
		String input = "";
		while(!input.matches("\\d{3}\\d{4}\\d{4}")) {
			System.out.println("전화번호를 입력해주세요 : ");
			input = s.nextLine();
		}
		System.out.println("전화번호 입력을 확인하였습니다.");
		
	}
	
	public void ex03() {
		/*
		 * 사용자 입력으로 전화번호를 입력 받고 출력할 때 전화번호 마지막 4자리 숫자는
		 * 다음의 문자로 마스킹 처리하여 출력되도록 한다. ( 마스킹문자 -> * )
		 */
	}
	
	public void ex04() {
		/*
		 * 사용자 입력으로 이메일 주소 형식을 입력 받을 때 xxxxx@gmail.com 또는 xxxxx@naver.com,
		 * xxxxx@nate.com 의 주소 형식만 받을 수 있도록 한다.(xxxxx는 5글자 제한 아님)
		 */
	}

	public static void main(String[] args) {
		Sample sample = new Sample();
//		sample.ex01();
		sample.ex02();

	}

}
