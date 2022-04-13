package Class_14;

public class Main {
	public static void main (String[] args) {
		/*
		 * 업캐스팅
		 */
		Person s1 = new Student("최신형", 28);
		Person t1 = new Teacher("김기범", 29);
		
		System.out.println("이름 : " + s1.getName());
		System.out.println("나이 : " + s1.getAge());
		System.out.println("--------------------");
		System.out.println("이름 : " + t1.getName());
		System.out.println("나이 : " + t1.getAge());
		System.out.println("--------------------");
		
		//배열 활용
		Person[] p1 = new Person[3]; //원래는 같은 타입만 저장이 됨
		p1[0] = new Teacher("코코", 7);
		p1[1] = new Student("최아현", 29);
		p1[2] = new Student("김지수", 29);
		
		for(int i = 0; i < p1.length; i++) {
			System.out.println("이름 : " + p1[i].getName());
			System.out.println("나이 : " + p1[i].getAge());
			System.out.println("--------------------");
			//여기서는 classLevel이나 classRoom을 출력할 수 없다. 부모클래스의 기능만 사용가능하기 때문.
			//사용하려면 다시 자식클래스로 다운캐스팅을 해줘야하는데 여기에서는 배열0번 인덱스와 1,2번 인덱스의 자식클래스가 다르기 때문에 불가
		}
		//다운캐스팅해서 classLevel, Room 출력
		Person s2 = new Student("홍길동", 19); // 위와 동일하게 업캐스팅을 한 후
		Student s3 = (Student) s2; // student타입으로 2참조변수를 다운캐스팅하여 s3참조변수에 대입한다.
		s3.setClassLevel(1);
		s3.setClassRoom(2);
		System.out.println("이름 : " + s3.getName());
		System.out.println("나이 : " + s3.getAge());
		System.out.println("학년 : " + s3.getClassLevel());
		System.out.println("반 : " + s3.getClassRoom());
		System.out.println("--------------------");
		
		Person t2 = new Teacher("김철수", 19);
		Teacher t3 = (Teacher) t2;
		t3.setClassLevel(2);
		t3.setClassRoom(3);
		t3.setSubject("국어");
		
		System.out.println("선생님 이름 : " + t3.getName());
		System.out.println("나이 : " + t3.getAge());
		System.out.println("담당 학년 : " + t3.getClassLevel());
		System.out.println("담당 반 : " + t3.getClassRoom());
		System.out.println("담당 과목 : " + t3.getSubject());
		System.out.println("--------------------");
		
		Person[] p2 = new Person[2];  //배열에 담으려면
		p2[0] = s3;		p2[1] = t3;  //다시 업캐스팅
		
		for(int i = 0; i < p2.length; i++) {
			int level, room;
			String subject = "";
			if(p2[i] instanceof Student) { //스튜던트 객체의 인스턴스냐
				level = ((Student) p2[i]).getClassLevel(); //다시 다운캐스팅
				room = ((Student) p2[i]).getClassRoom();
				System.out.printf("%d학년 %d반 학생\n", level, room);
			} else if(p2[i] instanceof Teacher) { //티쳐 객체의 인스턴스냐
				level = ((Teacher) p2[i]).getClassLevel();
				room = ((Teacher) p2[i]).getClassRoom();
				subject = ((Teacher) p2[i]).getSubject();
				System.out.printf("%d학년 %d반 %s과목 담당 선생님\n", level, room, subject);
			}
		}
		System.out.println("--------------------");

		
		
		
		
		
	}

}
