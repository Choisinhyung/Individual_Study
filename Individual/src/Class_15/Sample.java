package Class_15;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {
	Scanner sc = new Scanner(System.in);
	
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

		System.out.print("숫자를 입력해주세요 -> ");
		String num = sc.nextLine();
		
		String[] numArr = num.split(" ");
//		System.out.println(Arrays.toString(numArr));
		
		//문자열 입력 받은 것을 정수로 변환하고 기본자료형타입에 저장하는 형식으로 wrapper사용
		int[] iArr = new int[numArr.length];
		for(int i = 0; i < numArr.length; i++) {
			iArr[i] = Integer.parseInt(numArr[i]);
		}
	System.out.println(Arrays.toString(iArr));
		
		System.out.println("다음의 값을 입력하였습니다. ");
		System.out.println(String.join(", ", numArr));
	}
	
	public void ex02() {
		/*
		 * 사용자 입력으로 전화번호를 입력 받을 때 xxx-xxxx-xxxx 형식으로 입력하지 않은 경우 다시 입력하도록 한다.
		 */

		
		String input = "";
		while(!input.matches("\\d{3}\\d{4}\\d{4}")) {
			System.out.println("전화번호를 입력해주세요 : ");
			input = sc.nextLine();
		}
		System.out.println("전화번호 입력을 확인하였습니다.");
		
	}
	
	public void ex03() {
		/*
		 * 사용자 입력으로 전화번호를 입력 받고 출력할 때 전화번호 마지막 4자리 숫자는
		 * 다음의 문자로 마스킹 처리하여 출력되도록 한다. ( 마스킹문자 -> * )
		 */
		System.out.println("전화번호를 입력해주세요. -> ");
		String num = sc.nextLine();
		
		//입력값의 길이에서 4를 뺀 값에서부터 마지막까지 길이를 출력한다. -> 그 네번째 값을 ****으로 바꾼다
		//String masking = num.replace(num.substring(num.length() - 4, num.length()), "****");
//		String masking = num.substring(0, num.length()-4) + "****"; //이게 쉽넹ㅎㅎ
		String[] arr = num.split("-");
		arr[2] = "****";
		String masking = String.join("-", arr);
		System.out.println(masking);
	}
	
	public void ex04() {
		/*
		 * 사용자 입력으로 이메일 주소 형식을 입력 받을 때 xxxxx@gmail.com 또는 xxxxx@naver.com,
		 * xxxxx@nate.com 의 주소 형식만 받을 수 있도록 한다.(xxxxx는 5글자 제한 아님)
		 */
		System.out.print("메일 주소를 입력해주세요 -> ");
		String email = sc.nextLine();
		String[] arr = email.split("@");
		
		if(arr[1].equals("gmail.com")) {
			String mail = String.join("@", arr);
			System.out.println(mail + "을 입력하셨습니다.");
		} else if (arr[1].equals("naver.com")) {
			String mail = String.join("@", arr);
			System.out.println(mail + "을 입력하셨습니다.");
		} else if (arr[1].equals("nate.com")) {
			String mail = String.join("@", arr);
			System.out.println(mail + "을 입력하셨습니다.");
		} else {
			System.out.println("메일 형식을 잘못 입력하였습니다. 다시 입력해주세요.");
		}
		
		
	}

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.ex01();
//		sample.ex02();
//		sample.ex03();
//		sample.ex04();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
