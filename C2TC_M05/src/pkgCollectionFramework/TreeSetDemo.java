package pkgCollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(7);
		ts.add(23);
		ts.add(6);
		Iterator i2 = ts.iterator();
		while(i2.hasNext())
		{
			Object o2 = i2.next();
			System.out.println(o2);
		}
	}

}