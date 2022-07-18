class Data2 {
	int x;    // 멤버변수 x 선언
}


public class Ex6_7 {

	public static void main(String[] args) {
		Data2 d = new Data2();  // data2타입 참조변수 d 생성
		d.x = 10;   // data타입 x가 가리키는 값은 10
		System.out.println("main() : x = " + d.x);   // 10출력
		
		change(d);   // change 호출
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);  // 
	}
	static void change(Data2 c) {  // 참조형 매개변수 c
 		c.x = 1000;   // c.x가 가리키는 값이 1000 
		System.out.println("change() : x = " + c.x);  // 1000출력
	}
}

	// data타입 d의 주소값은 아래 d.x의 0x100이다
	// d.x의 주소값 0x100 _ 10을 저장
	// change(10) 호출 _ data타입이기 때문에 c변수가 가리키는 주소값은 0x100, 즉 x의 주소값
	// 1000을 참조변수 c가 가리키는 x에 저장 _ c.x = 1000
	// 오키.. 이해완