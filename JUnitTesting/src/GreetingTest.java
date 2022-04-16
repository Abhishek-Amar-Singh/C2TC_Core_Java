
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class GreetingTest
{
	@Test
	void testGreet()
	{
		Greeting greeting = new Greeting();
		assertEquals("Unexpected result", "Namaste", greeting.greet());
	}
}