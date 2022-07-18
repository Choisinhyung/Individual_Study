package BaekJune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(bf.readLine()); //분 단위

		//  a b - c = 끝나는 시간
		// 분을 60으로 만들기
		// a에서 b를 더했을 때 b가 59이상이면 a에서 1을 더해야 함
		// b에서 c를 더했을 때 c가 1000 이상이면 b에 1을 더해야 함
		// a b - c = 출력할 시간
		
		h += c/60;
		m += c%60;
		
		//분이 60이 넘어갔을 때
		if(m > 59) {
			h += 1;
			m -= 60;
		}
		
		//시간이 23보다 클 때
		if(h > 23) {
			h -= 24;
		}
		System.out.printf("%d %d", h, m);
	}
}

		