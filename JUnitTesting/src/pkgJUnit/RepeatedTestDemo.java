package pkgJUnit;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestDemo
{
	@RepeatedTest(5)
	void repeatTest()
	{
		System.out.println("Namaskar");
	}
}