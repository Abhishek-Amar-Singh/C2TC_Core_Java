package pkgJUnit;

import org.junit.jupiter.api.Test;

public class TestingDemo implements TestLifecycleDemo
{
	@Test
	void showPrint()
	{
		System.out.println("This is an unit testing");
	}
	
	@Test
	void printMsg()
	{
		System.out.println("TDD - Test Driven Development");
	}
}