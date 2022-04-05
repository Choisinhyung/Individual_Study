package array;

import java.util.*;

public class array06 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 받아 의자,컴퓨터,정수를 입력했을 때 맞으면 정답입니다가 출력되게.
		 */
		System.out.println("문자열을 입력해주세요 : ");
		
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++ ) { // i가 words의 길이(행)보다 작을동안 0~2
			System.out.printf("%s의 뜻은?", words[i]);
			String input = sc.nextLine();
			
			if(input.equals(words[i][1])) { // 문자열비교.equals
				System.out.println("정답입니다!");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.", words[i][1]);
				System.out.println();
			}
		}
		System.out.println("프로그램을 종료합니다.");
		

	}

}
