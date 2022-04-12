package Class_10;

public class Parent {
	public int number = 1;
	
	
	public Parent(int number) { // 부모의 매개변수있는 생성자가 존재하면 기본생성자가 자동으로 생성이 안되기 때문에 자식에 문제가 생김
		this.number = number;
	}
	public void setNumber(int number) {
		System.out.println("부모의 setNumber메서드 시작");
		this.number = number;
		System.out.println("부모의 setNumber메서드 끝");
	}
	
	public int getNumber() {
		return this.number;
	}
	
	

}
