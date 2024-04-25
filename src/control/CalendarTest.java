package control;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.getTime());
//		c.add(Calendar.DAY_OF_MONTH, 100);
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()));
//		System.out.println(new SimpleDateFormat("yyyy년 MM월 dd일").format(c.getTime()));
		
		Calendar c = Calendar.getInstance();
		c.set(2024, 5-1, 1);
		System.out.println(new SimpleDateFormat("yyyy년 MM월").format(c.getTime()));
		int w = c.get(Calendar.DAY_OF_WEEK);
		int endDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);		
		
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		
		for(int week = 1; week < w; week++) {
			System.out.print("   ");
		}
		
		for(int day = 1, week = w; day <= endDay; day++, week++) {
			System.out.printf("%2d ", day);
			if(week % 7 == 0) System.out.println();
		}
	}
}
