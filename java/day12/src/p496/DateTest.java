package p496;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd-HHMMSS");
		String str = sdf.format(date);
		System.out.println(str);
		
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");	
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY:MM:dd - hh:mm:ss");
		sdf2.setTimeZone(tz);
		System.out.println(sdf2.format(new Date()));
		
		
		Calendar cal = Calendar.getInstance();
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		System.out.printf("%d %d %d %d %d %d ",yy,mm,dd,hh,mi,ss);
		
	}

}
