package Class_08;

public class Main {

	public static void main(String[] args) {
		//배열을 이용한 객체 사용법 -> 객체배열
		Person[] p = new Person[3]; 
		
		p[0] = new Person("최신형");
		p[1] = new Person("김기범");
		p[2] = new Person("코코");

		for(int i = 0; i < p.length; i++) { 
			System.out.println(p[i].getName());
		}
		System.out.println("---------------");
		
		//Person클래스 참조변수배열p를 PersonList 참조변수 p2에 할당
		PersonList p2 = new PersonList(p); 
		//P2의 get메서드를 실행
		Person data = p2.get(1); //특정위치값을 찾겠다
		System.out.println(data.getName());

	}

}
