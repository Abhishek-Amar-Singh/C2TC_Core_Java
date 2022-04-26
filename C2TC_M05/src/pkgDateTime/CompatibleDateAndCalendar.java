package pkgDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class CompatibleDateAndCalendar
{
	public static void main(String[] args)
	{
		Date date = new Date();
		LocalDateTime localDateTime1 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		System.out.println(localDateTime1);
		
		LocalTime localTime = localDateTime1.toLocalTime();
		System.out.println(localTime);
		LocalDate localDate = localDateTime1.toLocalDate();
		System.out.println(localDate);
		
		Calendar calendar = Calendar.getInstance();
		LocalDateTime localDateTime2 = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
		System.out.println(localDateTime2);
	}
}
