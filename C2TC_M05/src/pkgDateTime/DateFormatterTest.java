package pkgDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatterTest {

	public static void main(String[] args)
	{
		LocalDateTime localDateTime1 = LocalDateTime.of(2016, Month.JANUARY, 28, 6, 30);
		System.out.println(localDateTime1);
		
		String format1 = localDateTime1.format(DateTimeFormatter.ISO_DATE);
		System.out.println(format1);
		
		String format2 = localDateTime1.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println(format2);
		
		String format3 = localDateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.FRANCE));
		System.out.println(format3);
	}
}
