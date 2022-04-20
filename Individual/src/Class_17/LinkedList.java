package Class_17;

public class LinkedList {

	public static void main(String[] args) {
		/*
		 * LinkedList
		 * 	배열은 구조가 간단하고 데이터를 읽는 데 걸리는 시간이 짧다(access time)
		 *  배열의 단점을 보안한 것이 LinkedList
		 *  크기변경x 추가삭제시간 업
		 *  불연속적으로 존재하는 데이터를 연결(link)
		 *  하나하나의 데이터를 연결한 것을 노드라고 한다. 
		 *  
		 *  //다음 노드를 가르키는 코드
		 *  class Node {
		 *  Node next;
		 *  object obj;}
		 *  
		 *  단점 : 접근성이 나쁨
		 *  이 접근성이 나쁜 것을 보안한데 doubly LinkedList 이중 연결리스트이다. (뒤로 이동 가능 but 삭제할때 두 가지연결을 끊어야하기 때문에 시간은 걸림)
		 *  
		 *  class Node {
		 *  Node next;
		 *  Node previous; //참조변수 한개 추가
		 *  object obj;}
		 *  
		 *  이중연결리스트를 보안한데 doubly circular linked list 이중 원형 연결 리스트 (양 끝의 값을 연결할때 원형으로~) 채널 1에서 뒤로가기 누르면 마지막 채널로 가는 것과 같은 의미
		 *  
		 */
		
//		순차적 데이터 추가/삭제는 arrayList가 빠름
//		비순차적 데이터 추가/삭제는 linkedList가 빠름(중간에 추가/삭제하는 것) - 필요할때마다 한개씩추가하기 떄문에 메모리 낭비는 적다
//		접근시간 테스트는 arrayList가 훨씬 빠름 BUT 비효율적인 메모리 사용~ 성능을 좋게하기위해 배열을 크게 잡았기 때문)
		
		

	}

}
