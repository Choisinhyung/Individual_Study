package array;

import java.util.Scanner;

public class copy_1 {

	public static void main(String[] args) {
		// 카이사르 암호 만들기
		
		// 사용자 입력으로 영단어를 입력받는다
		Scanner sc = new Scanner(System.in);
		System.out.print("영단어를 입력해주세요 -> ");
		String input = sc.nextLine();
		
		//입력받은 영단어는 문자 배열로 생성한다
		char[] arr = new char[input.length()]; // 입력값길이만큼 배열 arr에 저장
		for(int i = 0; i < input.length(); i++) { // 입력값배열의 길이만큼 반복 - 배열arr의 i번째 인덱스 값에 input으로 저장된 문자열 중에서 한 글자씩 선택해서 char타입으로 변환
			arr[i] = input.charAt(i);
		
		}
		
		//생성된 문자 배열에 대해 암호화된 배열을 저장하기 위한 배열을 새로 만든다
		//문자 쉬프트는 3으로 하고 만약 z문자에 대한 쉬프가 필요한 경우 a로 넘어가게 한다.
		
		char[] lock = new char[arr.length]; // 입력값길이만큼 배열 rock에 저장
		for(int i = 0; i < input.length(); i++) {
			if(arr[i] + 3 > 'z') { // 만약 배열 arr + 3이 z보다 크다면 (a~y)
				lock[i] = (char)(arr[i] + 3 - 26);
			} else {
				lock[i] = (char)(arr[i] + 3);
			}
		}
		
		String res1 = "";
		String res2 = "";
		
		for(int i = 0; i < input.length(); i++) {
			res1 += arr[i];
			res2 += lock[i];
		}
		
		System.out.printf("%s -> %s",res1 , res2);
		
		

	}

}
