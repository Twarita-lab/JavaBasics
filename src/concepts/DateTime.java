package concepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sd = new SimpleDateFormat();
		System.out.println(sd.format(d));
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
		System.out.println(Integer.parseInt(sdf2.format(d))+1);
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.getCalendarType());
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getWeeksInWeekYear());
		System.out.println(cal.getWeekYear());
		System.out.println(cal.getTimeZone().getID());
		System.out.println(Calendar.WEDNESDAY);
		System.out.println(Calendar.DAY_OF_YEAR);
		
		
	}

}
