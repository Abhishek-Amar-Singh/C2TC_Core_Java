package pkgCollectionFramework;

import java.util.Hashtable;
import java.util.Map;

class Mitra1
{
	int id;
	String name;
	public Mitra1(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class HashtableDemo
{
	public static void main(String[] args)
	{
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(100,"C");
		ht.put(102,"Java");
		ht.put(101,"JavaScript");
		ht.put(100,"C++");
		ht.put(103, "C#");
		System.out.println(ht);
		
		ht.remove(103);
		System.out.println(ht);
		
		System.out.println(ht.getOrDefault(101, "Not Found"));
		System.out.println(ht.getOrDefault(108, "Not Found"));
		
		ht.putIfAbsent(104, "PHP");
		System.out.println(ht);
		ht.putIfAbsent(102, "Java");
		System.out.println(ht);
		
		Mitra1 m1 = new Mitra1(113, "Vishal");
		Mitra1 m2 = new Mitra1(114, "Dimple");
		Mitra1 m3 = new Mitra1(218, "Raksha");
		Mitra1 m4 = new Mitra1(219, "Sufiya");
		Mitra1 m5 = new Mitra1(30, "Amaan");
		Mitra1 m6 = new Mitra1(122, null);
		Hashtable<Integer,Mitra1> ht2 = new Hashtable<Integer,Mitra1>();
		ht2.put(1, m1);
		ht2.put(2, m2);
		ht2.put(3, m3);
		ht2.put(4, m4);
		ht2.put(5, m5);
		ht2.put(6, m6);
		for(Map.Entry<Integer,Mitra1> e : ht2.entrySet())
		{
			int key = e.getKey();
			Mitra1 m = e.getValue();
			System.out.print("key="+key + ": ");
			System.out.println(m.id + " " + m.name);
		}
	}
}