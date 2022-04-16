package pkgJUnit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTestDemo
{
	@Test
	void testDev()
	{
		System.setProperty("ENVIRONMENT", "DEVELOPER");
		Assumptions.assumeTrue("DEVELOPER".equals(System.getProperty("ENVIRONMENT")));
		// remainder of test will proceed
	}
	
	@Test
	void testProd1()
	{
		System.setProperty("ENVIRONMENT", "PRODUCT");
		Assumptions.assumeTrue("DEVELOPER".equals(System.getProperty("ENVIRONMENT")), AssumptionsTestDemo::ignoredMsg);
		// remainder of test will be aborted, test is skipped if assumeTrue(false)
	}
	
	@Test
	void testProd2()
	{
		System.setProperty("ENVIRONMENT", "PRODUCT");
		Assumptions.assumeFalse("DEVELOPER".equals(System.getProperty("ENVIRONMENT")), AssumptionsTestDemo::ignoredMsg);
		// here, assumeFalse(false)..runs successfully
	}
	
	@Test
	void testProd3()
	{
		System.setProperty("ENVIRONMENT", "PRODUCT");
		Assumptions.assumingThat("DEVELOPER".equals(System.getProperty("ENVIRONMENT")), AssumptionsTestDemo::ignoredMsg);
		// here, assumingThat(false) or assumingThat(true)..runs successfully
	}
	
	private static String ignoredMsg()
	{
		return "testProd() execution gets ignored!";
	}
}