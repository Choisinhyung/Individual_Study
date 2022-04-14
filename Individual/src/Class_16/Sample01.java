package Class_16;

public class Sample01 {

	public static void main(String[] args) {
		// StringBuffer / StringBuilder
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("문자열");
		sb1.append(" 추가");
		System.out.println(sb1);
		
		sb1.insert(0, "StringBuilder ");
		System.out.println(sb1);
		
		sb1.insert(14, "클래스 : "); //위치값은 index이 아닌 offset도 많이 사용
		System.out.println(sb1);
		
		int idx = sb1.indexOf("Builder");
		System.out.println("Builder 문자열의 위치 -> " + idx);
		
		for(int i = 0; i < sb1.length(); i++) {
			System.out.println("StringBuilder에서 문자만 추출 : " + sb1.charAt(i));
		}
		
		System.out.println(sb1);
		sb1.replace(14, 17, "Class");
		System.out.println(sb1);
		
		sb1.deleteCharAt(20); //20번째 지우기ㅏ : 
		System.out.println(sb1);
		
		sb1.delete(19, 24); // 19~24 지우기
		System.out.println(sb1);
		
		sb1.setCharAt(14, 'c'); //14번째 문자를 c로 변경
		System.out.println(sb1);
		

	}

}
