package exam02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		ReportGrade r = new ReportGrade("최신형");
		
		//학생명 -> 성적표 생성
		//학생명, 과목명 -> 해당 학생의 성적표생성
		double[] grades = new double[] {78.5, 79.3, 87.2, 93.8, 93.4};
		String[] subjects = new String[] {"국어", "수학", "영어", "과학", "사회"};
		
		r.setGrades(grades);
		r.setSubject(subjects);
		
		r.setGrades("수학", 90.5);
		System.out.println(Arrays.toString(r.getGrades()));

	}

}
