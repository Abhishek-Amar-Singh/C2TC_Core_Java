package pkgDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest
{
	public static void main(String[] args)
	{
		LocalDateTime l = LocalDateTime.now();
		System.out.println(l);
		
		LocalDateTime of1 = LocalDateTime.of(2016, Month.DECEMBER, 20, 13, 50);
		System.out.println(of1);
		LocalDateTime of2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(of2);
		
		LocalDateTime parseDateTime = LocalDateTime.parse("2015-11-24T07:54");
		System.out.println(parseDateTime);
		
		LocalDateTime plus = parseDateTime.plusDays(5);
		System.out.println(plus);
		LocalDateTime minus = parseDateTime.minusHours(2);
		System.out.println(minus);
		
		System.out.println(parseDateTime.getMonth());
		
		LocalDateTime ldt = LocalDateTime.parse("2020-07-17T10:38:16");
		System.out.println(ldt.toLocalDate());
		System.out.println(ldt.toLocalTime());
		
		System.out.println(LocalDateTime.MAX);
		System.out.println(LocalDateTime.MIN);
	}
}
