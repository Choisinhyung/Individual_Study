package Class_05;

public class Circle {
	
	public final static double PI = 3.14;
	public double radius; // 반지름
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	
	public double area() { // 넓이 구하는 메서드 매개변수는 반지름
		return radius * radius * PI;
	}
	
	public double round() { // 둘레 구하는 메서드 매개변수는 반지름
		double result = 2 * PI * radius;
		return result;
	}

}
