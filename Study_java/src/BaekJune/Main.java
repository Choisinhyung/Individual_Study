package BaekJune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 45분 일찍 알람 설정하기
		// 
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 0 ≤ H ≤ 23
		// 0 ≤ M ≤ 59 : m이 0아래이면? h가 -1 되어야 함
		// m이 45 이상이면 - 45
		// 이하면 h -1 / m + 60 - 45
		
		if(m >= 45) {
			System.out.printf("%d %d",h, m - 45);
		} else {
			if(h == 0) {
				h = 24;
				System.out.printf("%d %d", h - 1, m + 60 - 45);
			} else {
				System.out.printf("%d %d", h - 1, m + 60 - 45);
			}
		}
	}
}


		