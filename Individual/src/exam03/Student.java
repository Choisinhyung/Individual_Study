package exam03;

import java.util.Random;

public class Student {
	
	private String name;
	private int age;
	private int classLevel; //학년
	private int classRoom; //반
	private int classNum; //번호
	
	public Student() {
		
	}
	
	public Student(String name, int age, int classLevel) {
		this.name = name;
		this.age = age;
		this.classLevel = classLevel;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getClassLevel() {
		return this.classLevel;
	}
	
	public int getClassRoom() {
		return this.classRoom;
	}
	
	public int getClassNum() {
		return this.classNum;
	}
	
	
	
	public void nextYear() { // 년도가 바뀌면 나이가 1씩 증가
		this.age++;

		if(this.classLevel == 3) {
			this._graduate();
		} else {
			this.classLevel++; //만약 3학년이 아니면 학년을 1증가해라
			this.classRoom = this._assignGenerateClassRoom(); // 반은 1~9반으로 랜덤으로 변경해라
			this.classNum = this._assignGenerateClassNum();
		}		
	}
	
	private int _assignGenerateClassRoom() { //반 배정 메서드
		Random rand = new Random();
		return rand.nextInt(9) + 1;
	}
	
	private int _assignGenerateClassNum() { //번호 배정 메서드
		Random rand = new Random();
		return rand.nextInt(30) + 1;
	}
	
	private void _graduate() { //졸업메서드
		this.classLevel = -1;
		this.classRoom = -1;
		this.classNum = -1;
	}

	@Override
	public String toString() {
		return "학생의 이름은 " + name + "이며, 나이는 " + age + "세이고, " + classLevel + "학년" + classRoom + "반" + classNum + "번 입니다. ";
	}
	
	

}
