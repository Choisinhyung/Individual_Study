package Class_11;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("최신형");
		s.setAge(28);
		s.setGender('여');
		s.setClassLevel(1);
		s.setClassRoom(5);
		System.out.println(s);
		
		Teacher t = new Teacher();
		t.setName("김기범");
		t.setAge(29);
		t.setGender('남');
		t.setClassLevel(1);
		t.setClassRoom(5);
		t.setSubject("컴공");
		System.out.println(t);
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("최"); p1.setAge(10); p1.setGender('여');
		p2.setName("최"); p2.setAge(10); p2.setGender('여');
		System.out.println(p1.equals(p2));
		
		

	}

}
