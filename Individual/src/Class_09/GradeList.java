package Class_09;

public class GradeList {
	/*
	 * grade객체를 배열로 만들어서 다루기 위한 객체
	 *  	- 데이터 추가, 수정, 삭제, 조회를 할 수 있게 한다.
	 */
	
	private Grade[] gArr = new Grade[0]; // 배열공간이 0인 gArr생성
	
	public GradeList() { //기본생성자정의
		
	}
	
	public GradeList(int size) { //매개변수가 정수일경우 - 배열길이 생성
		this.gArr = new Grade[size]; // 배열의 길이만큼을 gArr에 Grade객체 생성
	}
	
	public GradeList(String ... subjects) { // 가변인자
		// new GradeList("과목1", "과목2", ... )
		this.gArr = new Grade[subjects.length];
		for(int i = 0; i < subjects.length; i++ ) {
			this.gArr[i] = new Grade(subjects[i]);
		}
	}
	
	public GradeList(Grade[] grade) {
		
	}
	
	public Grade get(int index) {
		return this.gArr[index];
	}
	
	public String getName(int index) {
		return this.gArr[index].getName();
	}
	
	public double getScore(int index) {
		return this.gArr[index].getScore();
	}
	
	public int length() {
		return this.gArr.length;
	}
	
	//추가
	public void add(String name) { // 과목 정보에 대한 추가

	}
	
	public void add(String name, double score) { //과목과 점수 정보에 대한 추가

	}
	
	public void add(Grade grade) { //grade타입객체 grade

	}
	/*
	 * 수정
	 * 1. 수정 할 자료를 찾는다.
	 * 2. 찾은 자료에 대해 수정을 한다.
	 */
	
	public void update(String search, String change) { //과목명을 찾아서 바꾼다
		
	}
	
	public void update(String search, double change) {
		
	}
	
	public void update(String search, String changeName, double changeScore) {
		
	}
	
	public void update(String search, Grade change) {
		
	}
	
	public void update(int index, String change) {
		
	}
	
	public void update(int index, double change) {
		
	}
	
	public void update(int index, String changeName, double changeScore) {
		
	}
	
	public void update(int index, Grade change) {
		
	}
	//삭제
	
	//조회
	

}
