package Class_07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Page p = new Page(100);
		
		for(int i = 0; i < 10; i++) {
			p.nextPage();
			System.out.println(p.getPageNumber() + "번째 페이지");			
		}
		
//		for(int i = 0; i < 10; i++) {
//			p.prevPage();
//			System.out.println(p.getPageNumber() + "번째 페이지");			
//		}
		
		for(int i = 0; i < 10; i++) {
			p.prevPage(2);
			System.out.println(p.getPageNumber() + "번째 페이지");			
		}

	}

}
