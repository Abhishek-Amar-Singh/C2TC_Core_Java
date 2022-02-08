package pkgGenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo1
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Swami Vivekananda");
		al.add("Mahatma Gandhi");
		al.add("Subhash Chandra Bose");
		
		String greatBeings = al.get(0);
		System.out.println("1st value is: " + greatBeings);
		
		Iterator<String> itr = al.iterator();
		System.out.println("Iteration:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
