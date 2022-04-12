package Class_11;

public class Teacher extends Person {
	private int classLevel; //학년 담임
	private int classRoom; //반 담임
	private String subject; //담당 과목
	
	public int getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(int classLevel) {
		this.classLevel = classLevel;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return getName() + "|" + getAge() + "|" + getGender()
		+ "|학년:" + getClassLevel() + "|반:" + getClassRoom()
		+ "|담당 과목:" + getSubject();
	}
	
	
}


