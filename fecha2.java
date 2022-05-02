package fechas;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class fecha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar today = Calendar.getInstance();
		Calendar otroToday = new GregorianCalendar(2021, Calendar.FEBRUARY, 22, 23, 11, 44);

		verFecha(today);
		verFecha(otroToday);

		
	}
  
	private static void verFecha(Calendar today) {
		
		
		Locale locale = Locale.getDefault();

		System.out.println("Year : " + today.get(Calendar.YEAR));
		System.out.println("Month (0 is January): " + today.get(Calendar.MONTH));
		System.out.println("Month (String): " + today.getDisplayName(Calendar.MONTH, Calendar.LONG, locale));
		System.out.println("Day of Month : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of Week (0 is Sunday): " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of Week (String): " + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, locale));
	
		System.out.println("Week of Year : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Week of Month : " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("Day of Year : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("24-hour clock : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("12-hour clock : " + today.get(Calendar.HOUR));
	
		System.out.println("AM/PM : " + today.get(Calendar.AM_PM));
		System.out.println("AM/PM : " + today.getDisplayName(Calendar.AM_PM, Calendar.LONG, locale));
		
		System.out.println("Minutes : " + today.get(Calendar.MINUTE));
		System.out.println("Seconds : " + today.get(Calendar.SECOND));
		System.out.println("MiliSeconds : " + today.get(Calendar.MILLISECOND));

		System.out.println("-------------------------------------");

	}

}
