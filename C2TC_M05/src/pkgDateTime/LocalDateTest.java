package pkgDateTime;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest
{
	public static void main(String[] args)
	{
		//getLocalDateDemo1();
		DayOfWeek dayOfWeek = LocalDate.parse("2019-04-12").getDayOfWeek();
		System.out.println(dayOfWeek);
		int dayOfMonth = LocalDate.parse("2019-04-12").getDayOfMonth();
		System.out.println(dayOfMonth);
		
		System.out.println();
		LocalDate thisYear = LocalDate.now();
		System.out.println(thisYear.isLeapYear());
		LocalDate previousYear = LocalDate.now().minusYears(1);
		System.out.println(previousYear.isLeapYear());
		
		System.out.println();
		boolean before = LocalDate.parse("2019-04-12").isBefore(LocalDate.parse("2019-03-01"));
		System.out.println(before);
		boolean after = LocalDate.parse("2019-04-12").isAfter(LocalDate.parse("2019-03-01"));
		System.out.println(after);
		
		System.out.println("---------------");
		LocalDateTime atStartOfDay = LocalDate.parse("2019-04-12").atStartOfDay();
		System.out.println(atStartOfDay);
		LocalDate with = LocalDate.parse("2019-04-12").with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(with);
	}

	private static void getLocalDateDemo1()
	{
		LocalDate localDate1 = LocalDate.now();
		System.out.println(localDate1);
		
		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate2 = LocalDate.now(clock);
		System.out.println(localDate2);
		
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		LocalDate localDate3 = LocalDate.now(zoneId);
		System.out.println(localDate3);
		
		System.out.println("-----------------");
		LocalDate localDate4 = LocalDate.of(2019, 10, 23);
		System.out.println(localDate4);
		
		LocalDate localDate5 = LocalDate.parse("2018-09-15");
		System.out.println(localDate5);
		
		LocalDate localDate6 = localDate5.plusDays(2);
		System.out.println(localDate6);
		
		LocalDate minus = localDate5.minus(4, ChronoUnit.DAYS);
		System.out.println(minus);
	}
}
