package pkgGenerics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcardDemo
{
	public static void displayNumbers(List<? super Integer> list)//? is Number/Object which is super-class of Integer
	{
		for(Object n : list)
		{
			System.out.println(n);
		}
	}
	
	public static void main(String args[])
	{
		List<Integer> ll = Arrays.asList(1, 2, 3);
		System.out.println("display values");
		displayNumbers(ll);
		
		List<Number> l2 = Arrays.asList(1.0, 2.0, 3.0);
		System.out.println("display values");
		displayNumbers(l2);
		
		/*List<Double> l3= Arrays.asList(1.0,2.0,3.0);
		System.out.println("display values");
		displayNumbers(l3);*/
	}
}