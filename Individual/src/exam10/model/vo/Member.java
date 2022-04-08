package exam10.model.vo;

public class Member {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() { //기본 생성자 생략가능
		
	}
	

	
	public void changeName(String name) {
		this.memberName = name;
	}
	 
	public void printName() {
		System.out.println(memberName + "입니다.");
	}

}
