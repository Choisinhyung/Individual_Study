package Class_10;

public class Child extends Parent {
	
	public Child() {
		super(5);
	}
	
	public void printNumber() {
		setNumber(3);
		System.out.println(getNumber());
	}
	
	@Override
	public void setNumber(int number) { //부모의 setNumber상속 오버라이딩
		//super를 사용해서 부모의 기능을 먼저 수행시키고 나온 결과물로 자식의 기능을 수행
		System.out.println("자식의 setNumber메서드 시작");
		super.setNumber(number);
		System.out.println("자식의 setNumber메서드 끝");
	}

}
