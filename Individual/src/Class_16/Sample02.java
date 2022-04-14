package Class_16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Sample02 {

	public static void main(String[] args) {
		/*
		 * Date 클래스
		 * 	- 시스템으로부터 현재 날짜, 시간 정보를 가져와서 사용할 수 있게 만들어진 클래스
		 * 
		 */
		
		Date date = new Date();
		System.out.println(date);
		
		
		//폐기대상 코드
//		System.out.println(date.getDate());
//		System.out.println(date.getMonth() + 1);
//		System.out.println(date.getYear());
//		System.out.println(date.getHours());
		
		System.out.println(String.format("%1$tY년 %1$tm월 %1$td일 %1$tH : %1$tM : %1$tS", date));
		
		/*
		 * Calendar클래스
		 * 	- new연산자로 객체 생성을 할 수 없음.
		 * getInstance사용
		 */
		
//불가	Calendar c = new Calendar(); 
		Calendar c = Calendar.getInstance(); 
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		
		c.add(Calendar.YEAR, 1); //현재년도에 1을 더해라
		System.out.println(String.format("%1$tY년 %1$tm월 %1$td일 %1$tH : %1$tM : %1$tS", c.getTime())); // 더해서 시간 출력
		
		c.add(Calendar.MONTH, 13);
		System.out.println(String.format("%1$tY년 %1$tm월 %1$td일 %1$tH : %1$tM : %1$tS", c.getTime()));
		
		c.add(Calendar.DATE, 60);
		System.out.println(String.format("%1$tY년 %1$tm월 %1$td일 %1$tH : %1$tM : %1$tS", c.getTime()));
		
		int i = c.getActualMaximum(Calendar.DATE);
		System.out.println(i);
		
		c.add(Calendar.MONTH, 2);
		i = c.getActualMaximum(Calendar.DATE); //현재 월의 최대 일수
		System.out.println(i);
		
		/*
		 * GregorianCalendar 클래스
		 * 	- Calendar 클래스를 상속하여 사용하는 클래스
		 */
		
		GregorianCalendar c2 = new GregorianCalendar();
		System.out.println(c2.get(Calendar.YEAR));
		System.out.println(c2.get(Calendar.MONTH) + 1);
		System.out.println(c2.get(Calendar.DATE));
		System.out.println(c2.get(Calendar.HOUR));
		System.out.println(c2.get(Calendar.MINUTE));
		System.out.println(c2.get(Calendar.SECOND));
		
		/*
		 * SimpleDateFormat 클래스
		 * 	- 날짜 포멧 형식을 자유롭게 만들기 위해 사용하는 클래스
		 */
		
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
		String now = s1.format(new Date());
		System.out.println(now);
		
		s1.applyPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초 .SSS");
		now = s1.format(new Date());
		System.out.println(now);
		
		s1.applyPattern("yyyy년 MM월 dd일");
		try {
			Date d2 = s1.parse("2022년 10월 10일"); //문자열을 날싸로 변환
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
