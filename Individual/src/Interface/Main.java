package Interface;

public class Main {

	public static void main(String[] args) {

		/*
		 * 인터페이스 interface
		 * 상수형 필드와 추상 메서드의 집합(몸통없는) - abstract키워드 생략가능
		 * public static final생략
		 * 메서드의 일관성을 부여하기 위해 사용한다.
		 * 인터페이스르 상속하는 클래스는 extends가 아닌 implements를 사용한다.
		 * 구현된 것이 전혀 없는 설꼐도. 껍데기 ( 모든 멤버가 public )
		 * 다중상속 가능
		 * 인터페이스로 객체 생성은 할 수 없지만 참조타입으로는 사용할 수 있다. (업캐스팅, 다운캐스팅)
		 * person p = new person(); 불가능  // person p = new Teacher(); 가능
		 */
		// Shape s = new Shape(); //불가
		Shape s1 = new Circle();
		Shape s2 = new Square();
		
		
	}

}
