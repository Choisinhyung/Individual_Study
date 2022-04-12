package Class_12;

public class Subject {
	//과목 정보를 가지는객체 - 과목에는 Grade를 포함시킨다.
	private String name; // 과목 정보를 가지는 객체
	private Grade grade; // 과목에는 grade를 포함시킨다
	
	public Subject(String name) {
		this.name = name;
	}
	
	public Subject(String name, double point) { //포인트는 과목에 점수를 설정
		this.name = name;
		this.grade = new Grade(point);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	
	
	
}
