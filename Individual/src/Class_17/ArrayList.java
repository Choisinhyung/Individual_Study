package Class_17;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList {

	public static void main(String[] args) {
		
		/*
		 * ArrayList
		 */

		// 기본길이 (용량)가 10인 arrayList 생성
		 ArrayList list = new ArrayList(10);
		 //객체만 저장 가능
		 //autoboxing에 의해 기본형이 참조형으로 자동 변환
		 
		 //list.add(4);
		 list.add(new Integer(4));
		 list.add(new Integer(5));
		 list.add(new Integer(0));
		 //새로운 객체를 생성해서 뽑아내야 함
		 //ArrayList(Collection c)
		 ArrayList list2 = new ArrayList(list.subList(0,2)); // sublist 읽기전용 0 <= x < 4
		 print(list, list2);
		 
		 //collection은 인터페이스, collections는 util클래스
		 Collections.sort(list); // list와 list2를 정렬한다. 오름차순
		 Collections.sort(list2); // collection.sort(list1)
		 print(list, list2);
		 
		 //list2의 모든 요소를 list가 포함하는지~ ( true, false )
		 System.out.println("list.containsAll(list2) : " + list.containsAll(list2));
		 
		 list2.add(new String("A"));
		 list2.add(new String("b"));
		 list2.add(new String("c"));
		 list2.add(3, "c"); //add(index,추가값) 원하는 인덱스에 추가
		 print(list, list2);
		 
		 System.out.println("list.containsAll(list2) : " + list.containsAll(list2));
		 
		 list2.set(3, "aa"); // 3번째 위치값을 변경
		 print(list,list2);
		 
		 list.add(0, "1");
		 print(list,list2);
		 //indexOf는 지정된 객체의 위치를 알려준다
		 System.out.println("index=" + list.indexOf(5));
		 
//		 list.remove(1); //인덱스1번째 삭제
		 list.remove(new Integer(4)); // 값이 4인 것을 찾아서 삭제
		 print(list,list2);
		 
		 //겹치는 부분만 남기고 나머지는 삭제한다.
		 System.out.println("list.retainAll(list2) : " + list.retainAll(list2));
		 print(list,list2);
		 
		 //list2에서 list에 포함된 객체들을 삭제한다.
		 for(int i = 0; i < list2.size()-1; i++) { //list2의 사이즈에서 -1값을 뺀만큼 반복해라
			 if(list.contains(list2.get(i))) //만약 list에서 list2의 i번째 값을 포함하고 있다면
				 list2.remove(i); // list2에서 i값을 삭제해라
		 }
		 // 끝에서부터 삭제해야 마지막에 값이 안남기 때문에 -1을 사용 배열복사 발생안함.
		 // for(int i = list2.size()-1; i <= 0; i++ {
		 		// list2.remove(i)
		 print(list,list2);
		 
	}

	private static void print(ArrayList list, ArrayList list2) {
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
	}
}