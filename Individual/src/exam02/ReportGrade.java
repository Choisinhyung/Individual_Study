package exam02;

public class ReportGrade {
	
	private String name; //학생명
	private String[] subject; //과목명
	private double[] grades; //점수 저장
	// 각 배열의 인덱스는 서로 동일한 인덱스간에 연계되는 형태이다
	// 국어 과목의 인덱스가 0번이면 점수는 0번에 저장되어 있는 방식이다
	
	public ReportGrade (String name) {
		//학생명이 주어지면 해당 학생의 성적표를 생성하기 위한 생성자
		this.name = name;
	}
	
	public ReportGrade (String name, String[] subject) {
		//학생명과 과목배열이 주어지면 해당학생의 성적표를 생성하기위한 생성자
		this.name = name; 
		this.subject = subject;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		
		this.subject = subject;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		//점수 설정시 어떤 과목에 대한 점수인지를 알 수있도록 setter의 매개변수를 조정하여 사용
		this.grades = grades;
	}
	
	public void setGrades(String subject, double grade) {
		/*
		 * 과목배열의 0번인덱스가 국어이면 국어과목에 대한 점수는 점수배열의
		 * 0번인덱스에 있다.
		 */
		int idx = -1;
		for(int i = 0; i < this.subject.length; i++) {
			if(this.subject[i].equals("수학")) {
				idx = i;
				break;
			}
		}
		this.grades[idx] = grade;
	}
}
