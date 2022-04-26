package pkgDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeTest
{
	public static void main(String[] args)
	{
		ZoneId zoneId = ZoneId.of("Australia/Sydney");
		ZonedDateTime of = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(of);
		
		/*
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		availableZoneIds.forEach(System.out::println);
		*/
		
		LocalDateTime ldt = LocalDateTime.of(2015, Month.JANUARY, 22, 6,30);
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime odt = OffsetDateTime.of(ldt, offset);
		System.out.println(odt);
	}
}
