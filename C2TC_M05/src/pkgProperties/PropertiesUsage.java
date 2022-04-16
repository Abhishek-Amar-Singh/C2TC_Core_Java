package pkgProperties;

import java.util.Properties;

public class PropertiesUsage
{
	public static void main(String[] args)
	{
		Properties prop = new Properties();
		
		prop.setProperty("user", "Abhishek");
		prop.setProperty("password", "abpass@123");
		System.out.println(prop.get("user"));
		System.out.println(prop.get("password"));
		
		System.out.println(prop.containsKey("user"));
		System.out.println(prop.containsValue("Abhishek"));
		
		prop.clear();
		System.out.println(prop.keySet().size());
	}
}