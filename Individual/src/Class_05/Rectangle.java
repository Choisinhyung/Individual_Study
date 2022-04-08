package Class_05;

public class Rectangle {
	
	public double width; // 폭
	public double height; // 높이
	
	public double area(double width, double height) {
		return width * height;
	}
	
	public double round(double width, double height) {
		double result =  (width + height) * 2;
		return result;
	}


}
