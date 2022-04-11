package Class_08;

public class PersonList {
	private Person[] p1 = new Person[0]; //person타입 객체 p1생성
	
	public PersonList(Person[] data) { // person배열타입 data매개변수
		this.p1 = data; //매개변수 배열 data를 p1에 할당
	}
	
	public Person get(int index) { //특정 위치값 찾는 메서드
		//person타입 get메서드 생성 - 매개변수는 int index
		return this.p1[index]; //person타입 배열 p1의 index를 반환
		
	}
}
