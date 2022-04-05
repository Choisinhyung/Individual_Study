package Object_oriented;

public class Main {

	public static void main(String[] args) {
		/*
		 * tv객체를 생성하여 채널을 변경하는 메서드를 실행 할 것
		 */
		
		Tv t = new Tv(); // 티비 객체 생성
		t.channel = 7;
		t.channelDown();
		System.out.println(t.channel);
	}
}

public class Tv {
	
	public int channel;
	private int volume;
	private boolean power;
	private String color;
	
	
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}

}
