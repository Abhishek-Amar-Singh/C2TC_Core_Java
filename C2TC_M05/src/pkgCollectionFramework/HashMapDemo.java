package pkgCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"Mango");
		hm.put(53,"Apple");
		hm.put(31,"Banana");
		hm.put(4,"Grapes");
		hm.put(null, null);
		hm.put(null, "berry");
		hm.put(5, null);
		
		System.out.println(hm);
		
		System.out.println("Iterating Hashmap:");
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}