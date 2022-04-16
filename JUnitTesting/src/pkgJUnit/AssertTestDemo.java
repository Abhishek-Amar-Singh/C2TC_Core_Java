package pkgJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled
public class AssertTestDemo
{
	@Test
	public void display1()
	{
		int a = 1, b = 1;
		assertEquals(a, b);
	}
	
	@Test
	public void display2()
	{
		int a = 3, b = 2;
		assertEquals(a, b);
	}
	
	@Disabled
	@Test
	public void display3()
	{
		int a = 1, b = 3;
		assertEquals(a, b);
	}
}