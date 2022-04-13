package Class_13;

import java.util.Random;

import Class_13.Customer;
import Class_13.NormalCustomer;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		Customer[] c = new Customer[5]; //일반고객 5명을 배열에 넣음
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new NormalCustomer(); //부모클래스의 각 배열 인덱스에 업캐스팅을하여 일반고객 객체 생성
		}
		
		int unit = 10000;
		for(int i = 0; i < 100; i++) { //구입기능 100번반복
			int idx = r.nextInt(c.length);
			NormalCustomer c1 = (NormalCustomer) c[idx];
			
			int price =(r.nextInt(990000) / unit * unit);
			c1.buy("xxxx", price);
			
			if(price > 1000000) {
				PremiumCustomer p = new PremiumCustomer();
				p.setName(c1.getName());
				p.setAge(c1.getAge());
				p.setGender(c1.getGender());
				p.setTotalPrice(price);
				c[idx] = p;
				System.out.println("축하합니다 구입액이 백만원을 초과하여 프리미엄 등급으로 상승하였습니다.");
				System.out.println("앞으로 물품 구입 누적액에 따른 할인율이 적용됩니다.");
			}
		}

	}

}
