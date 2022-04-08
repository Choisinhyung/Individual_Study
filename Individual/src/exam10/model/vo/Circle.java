package exam10.model.vo;

public class Circle {
	
	private final double PI = 3.14;
	private int radius = 1; // 반지름
	
	
	public Circle () {
		
	}
	
	public void incrementRadius() { //증가값
		radius++;
	}
	
	public void getAreaOfCircle() { //넓이 파이r2
		System.out.println(radius * radius * PI);
	}
	
	public void getSizeOfCircle() { //둘레 2파이r
		System.out.println(2 * PI * radius);
	}
	

}
