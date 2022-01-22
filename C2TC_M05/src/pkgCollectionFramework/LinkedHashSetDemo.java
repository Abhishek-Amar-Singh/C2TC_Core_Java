package pkgCollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Mitra
{
	int id;
	String name;
	public Mitra(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "Mitra [id=" + id + ", name=" + name + "]";
	}
}

class LinkedHashSetDemo
{
	public static void main(String args[])
	{  
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("C++");
		lhs.add("Java");
		lhs.add("JavaScript");
		lhs.add("C++");
		lhs.add("C#");
		System.out.println(lhs);
		Iterator<String> i=lhs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("---------------------------");
		
		Mitra m1 = new Mitra(114, "Dimple");
		Mitra m2 = new Mitra(218, "Raksha");
		Mitra m3 = new Mitra(219, "Sufiya");
		Mitra m4 = new Mitra(30, "Shruti");
		Mitra m5 = new Mitra(130, "Amaan");
		Mitra m6 = new Mitra(131, "Vishal");
		Mitra m7 = new Mitra(120, "Suparna");
		Mitra m8 = new Mitra(122, "Vaishali");
		Mitra m9 = new Mitra(122, "Sunita");
		Mitra m10 = new Mitra(122, "Pinky");
		Mitra m11 = new Mitra(122, null);
		LinkedHashSet<Mitra> lhs2 = new LinkedHashSet<Mitra>();
		lhs2.add(m1);
		lhs2.add(null);
		lhs2.add(m2);
		lhs2.add(m3);
		lhs2.add(m4);
		lhs2.add(m5);
		lhs2.add(m6);
		lhs2.add(m7);
		lhs2.add(m8);
		lhs2.add(m9);
		lhs2.add(m10);
		lhs2.add(m11);
		for(Mitra m : lhs2)
		{
			System.out.println(m);
		}
	}
}