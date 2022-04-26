package pkgDateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest
{
	public static void main(String[] args)
	{
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalTime setTime = LocalTime.parse("12:30");
		System.out.println(setTime);
		
		LocalTime of = LocalTime.of(12, 20);
		System.out.println(of);
		LocalTime plus = of.plus(2, ChronoUnit.HOURS);
		System.out.println(plus);
		
		boolean before = LocalTime.parse("12:30").isBefore(LocalTime.parse("12:35"));
		System.out.println(before);
		boolean after = LocalTime.parse("12:30").isAfter(LocalTime.parse("12:35"));
		System.out.println(after);
		
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.NOON);
	}
}
