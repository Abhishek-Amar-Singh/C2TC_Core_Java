package pkgCollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();  
		tm.put(1,"Mango");
		tm.put(53,"Apple");
		tm.put(31,"Banana");
		tm.put(4,"Grapes");   
		//map.put(null, "kl");
		tm.put(105, null);
		
		System.out.println(tm);
		
		System.out.println("Iterating Treemap:");
		for(Map.Entry m : tm.entrySet())
		{    
	       System.out.println(m.getKey()+" "+m.getValue());
	    }
	}
}