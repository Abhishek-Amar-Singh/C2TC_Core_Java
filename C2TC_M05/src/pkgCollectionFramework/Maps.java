package pkgCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Maps
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		map.put("Vishal", "Car");
		map.put("Ramesh", "Motorcycle");
		map.put("Pratibha", "Bicycle");
		
		map.forEach((key, value) -> {
			System.out.printf("%s is driving %s.\n", key, value);
		});
	}
}
