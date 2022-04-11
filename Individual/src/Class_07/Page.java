package Class_07;

public class Page {
	private int pageNumber;
	private int limitPageNumber;
	
	public Page(int limitPageNumber) {
		this.limitPageNumber = limitPageNumber;
	}
	
	public int getPageNumber() {
		return pageNumber;
	}

	public void nextPage() { // 다음장으로 넘기는 기능
		if(this.nextCheck()) {
			this.pageNumber++;			
		} else {
			System.out.println("더 이상 페이지를 넘길 수 없습니다.");
		}
	}
	
	public void nextPage(int number) { // 다음장으로 넘기는 기능
		if(this.nextCheck()) {
			this.pageNumber += number;			
		} else {
			System.out.println("더 이상 페이지를 넘길 수 없습니다.");
		}
	}
	
	public void prevPage() { // 이전장으로 넘기는 기능
		if(this.prevCheck()) {
			this.pageNumber--;			
		} else {
			System.out.println("더 이상 페이지를 넘길 수 없습니다.");
		}
	}
	
	public void prevPage(int number) { // 이전장으로 넘기는 기능
		if(this.prevCheck()) {
			this.pageNumber -= number;		
		} else {
			System.out.println("더 이상 페이지를 넘길 수 없습니다.");
		}
	}
	
	public boolean nextCheck() { // 다음페이지가 존재하는지
		// 한계를 정해야함 
		if(this.pageNumber + 1 > this.limitPageNumber) {
			return false;
		} else {
			return true; //다음페이지가 존재하면 있다..!			
		}
	}
	
	public boolean prevCheck() { // 이전페이지가 존재하는지
		if(this.pageNumber - 1 < 1) {
			return false;
		} else {
			return true; 	
		}
	}
}
