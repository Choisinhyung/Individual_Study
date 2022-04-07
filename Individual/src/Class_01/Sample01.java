package Class_01;

import java.util.Random;

public class Sample01 {
	
	public static void main(String[] arg) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.radius = 1.5;
		c2.radius = 3.5;
		
		c1.diamiter = c1.radius * 2;
		c2.diamiter = c2.radius * 2;
		
		c1.area = Circle.PI * c1.radius * c1.radius;
		c2.area = Circle.PI * c2.radius * c2.radius;
		
		System.out.printf("첫 번째 원의 넓이 -> %.2f\n" , c1.area);
		System.out.printf("두 번째 원의 넓이 -> %.2f\n" , c2.area);
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.width = c1.diamiter;
		r2.width = c2.diamiter;
		
		Random rand = new Random();
		
		int num = rand.nextInt(7) + 3;
		
		r1.height = num;
		r2.height = num;
		
		r1.area = r1.width * r1.height;
		r2.area = r2.width * r2.height;
		
		System.out.println("첫 번째 Rectangle의 넓이 -> " + r1.area);
		System.out.println("두 번째 Rectangle의 넓이 -> " + r2.area);
		
		
		
	}
	
}
	

