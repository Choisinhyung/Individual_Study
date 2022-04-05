import java.util.Scanner;

public class asf {

		public void count() {
			Scanner sc = new Scanner(System.in);
			
			
			while(true) { // ~하는동안
				System.out.println("문자열을 입력해주세요 : ");
				String str = sc.nextLine();
				if(str == "exit") {
					break;
				} else {
					System.out.println(str.length() + "글자입니다.");
					// length : 문자열에 대한 글자 수 반환 메소드
				}
			}
			
			System.out.println("프로그램을 종료합니다");
	

	}

}
