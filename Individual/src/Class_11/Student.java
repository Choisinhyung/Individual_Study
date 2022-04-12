package Class_11;

public class Student extends Person {
	private int classLevel; //학년
	private int classRoom; //반
	
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
	
	@Override
	public String toString() {
		return getName() + "|" + getAge() + "|" + getGender()
		+ "|학년:" + getClassLevel() + "|반:" + getClassRoom();
	}

	
}
