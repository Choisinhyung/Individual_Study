package Class_09;

public class Main {

	public static void main(String[] args) {
		
		GradeList gList = new GradeList(); //gradeList 배열의 비어져있는 공간객체 생성
		
		GradeList gList2 = new GradeList(5); // 배열처럼 초기값을 3 5등 설정해주면 그 크기만큼의 배열공간이 생성됨 이 기능을 제공할거냐 
		
		GradeList gList3 = new GradeList("국어", "수학");
		for(int i = 0; i < gList3.length(); i++) {
			System.out.println(gList3.getScore(i) + gList3.getName(i));			
		}
		
		GradeList gList4 = new GradeList("국어", "영어");
		
		GradeList gList5 = new GradeList("국어", "영어", "수학");
		
		Grade[] gArr = new Grade[2]; // Grade 배열을 만들고
		GradeList gList6 = new GradeList(gArr);  // 만들어진배열을 GradeList객체로 만들어서 제공을 할거냐
		

	}

}
