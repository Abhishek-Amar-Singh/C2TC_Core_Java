package pkgJUnit;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo
{
	@ParameterizedTest
	@ValueSource(strings = {"Red", "Green", "Blue"})
	void checkingDemo(String colors)
	{
		assertNotNull(colors);
	}
}
