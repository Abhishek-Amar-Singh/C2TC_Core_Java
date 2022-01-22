package pkgCollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.add(new Integer(55));
		ll.add("Hi");
		ll.addFirst("Hello");
		ll.add(0, 20);
		ll.add(20);
		ll.add(2, 30);
		ll.remove(2);
		
		Iterator i=ll.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
			
		}
	}
}