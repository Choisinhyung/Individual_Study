package Class_12;

import java.util.Objects;

public class Grade extends Score {
	//점수와 등급 정보를 가지는 객체
	private char level;
	
	public Grade(double point) {
		setPoint(point);
	}
	
	
	
	@Override
	public void setPoint(double point) {
		//부모한테는 점수만 자식은 점수+등급
		char[] rank = new char[] {
				'F', 'F', 'F', 'F', 'E', 'E', 'D', 'C', 'B', 'A','A'
				};
		super.setPoint(point);
		this.level = rank[(int)(this.getPoint()) / 10];
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(level);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grade other = (Grade) obj;
		return level == other.level;
	}
	@Override
	public String toString() {
		return "Grade [Point=" + getPoint() + ", level=" + level + "]";
	}
	
	

	
	
	
	
	
	
}
