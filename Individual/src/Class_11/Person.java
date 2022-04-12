package Class_11;

import java.util.Arrays;

public class Person {
	private String name;
	private char gender;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return getName() + "|" + getAge() + "|" + getGender();
	}
	
	@Override
	public boolean equals(Object obj) { //객체간의 비료 equals - 동일한 값에 비교하는 것 person객체 = Object obj
		//동일 객체인지를 참조값으로 비교하는 것이 아닌 객체의 멤버 변수 값으로
		//비교하고자 할 때 활용.
		Person p = (Person)obj;
		if(this.getName().equals(p.getName() )) {
			//person객체가 가지고 있는 이름과 동일한지. person이라는 객체로 형변환(다운캐스팅) obj
			if(this.getAge() == p.getAge() ) {
				if(this.getGender() == p.getGender() ) {
					return true;
				}
			}
		} 
		return false;
	}
	
	
	

}
