package exam01;

public class Lotto {
	
	private int rangeMin = 1;
	private int rangeMax = 45;
	private int count = 6; //로또 번호 생성 수
	private int[] numbers; //count만큼 생성될 번호들이 저장될 배열
	
	public Lotto() {
		
	}
	
	public Lotto(int min, int max, int count) {
		// 로또 번호의 생성 범위와 수를 초기에 설정하여 객체를 생성하기 위한 생성자
		this.rangeMin = min;
		this.rangeMax = max;
		this.count = count;
	}
	
	public int getRangeMin() {
		return rangeMin;
	}
	
	public void setRangeMin(int rangeMin) {
		this.rangeMin = rangeMin;
	}
	
	public int getRangeMax() {
		return rangeMax;
	}
	
	public void setRangeMax(int rangeMax) {
		this.rangeMax = rangeMax;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int[] getNumbers() {
		return numbers;
	}
	
	public void generate() { 
		// 이 메서드를 실행시켜 로또 번호가 생성될 수 있게 한다.
	}
	
	public void generate(int n1) { 
		// 위 메서드와 동일하다. 미리 제공된 정수값이 포함된 로또 번호가 생성되도록 함.
	}
	
	public void generate(int n1, int n2) { 
		
	}
	
	public void generate(int n1, int n2, int n3) { 
		
	}
	
	public void generate(int n1, int n2, int n3, int n4) { 
		
	}
	
	public void generate(int n1, int n2, int n3, int n4, int n5) { 
		
	}

}
