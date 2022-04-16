package pkgJUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class DynamicTestDemo
{
	@TestFactory
	Collection<DynamicTest> dynamicTests()
	{
		return Arrays.asList(
				dynamicTest("Simple dynamic test", () -> assertTrue(true)),
				dynamicTest("My executable class", new MyExecutable()),
				dynamicTest("Exception executable", () -> {throw new Exception("thrown exception example");}),
				dynamicTest("Simple dynamic test-2", () -> assertTrue(true))
				);
	}
}

class MyExecutable implements Executable
{
	@Override
	public void execute() throws Throwable
	{
		System.out.println("Dynamic testing capture");
	}
}