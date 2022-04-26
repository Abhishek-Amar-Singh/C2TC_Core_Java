package pkgDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationTest
{
	public static void main(String[] args)
	{
		LocalDate initialDate = LocalDate.parse("2017-02-10");
		LocalDate finalDate = initialDate.plus(Period.ofDays(13));
		
		int t = Period.between(initialDate, finalDate).getDays();
		System.out.println(t);
		
		long d = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(d);
		
		System.out.println("---------------");
		
		LocalTime initialTime = LocalTime.of(6, 30, 0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		
		long t1 = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println(t1);
		
		long d1 = ChronoUnit.SECONDS.between(initialTime, finalTime);
		System.out.println(d1);
	}
}
