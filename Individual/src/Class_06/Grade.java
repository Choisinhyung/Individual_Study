package Class_06;

public class Grade {
	
	private String name; // 과목명
	private double score; // 점수 0 ~ 100까지의 점수
	private char rank; // 등급 A ~ F까지의 등급
	
	public Grade(String name) { 
		//과목명이 주어지면 해당 이름의 성적을 생성하기 위한 생성자
		this.name = name;
	}
	
	public Grade(String name, double score) {
		//과목명과 점수가 주어지면 해당 이름의 성적을 생성하기 위한 생성자
		this(name);
		this.score = score;
	}
	
	//모든 멤버변수에 대한 getter/setter을 만들고 rank에 대한 setter은 생성하지 않는다.
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		if(score <= 100 && score >= 0) {
			this.score = score;			
		} else {
			this.score = 0;
		}
		//점수가 설정되면 여기에 등급을 분류하기 위한 코드를 작성
		if(this.score <= 100 && this.score >= 90) {
			this.rank = 'A';
		} else if(this.score < 90 && this.score >= 80) {
			this.rank = 'B';
		} else if(this.score < 80 && this.score >= 70) {
			this.rank = 'C';
		} else if(this.score < 70 && this.score >= 60) {
			this.rank = 'D';
		} else if(this.score < 60 && this.score >= 40) {
			this.rank = 'E';
		} else if(this.score < 40 && this.score >= 0) {
			this.rank = 'F';
		}
		
	}
	
	public char getRank() {
		return rank;
	}


}
