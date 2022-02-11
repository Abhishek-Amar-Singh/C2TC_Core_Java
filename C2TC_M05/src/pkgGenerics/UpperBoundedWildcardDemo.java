package pkgGenerics;

import java.util.ArrayList;

public class UpperBoundedWildcardDemo
{
	public static Double add(ArrayList<? extends Number> al)
	{
		double sum = 0.0;
		for(Number n:al)
		{
			sum = sum + n.doubleValue();
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		System.out.println("The sum is: " + add(al1));
		
		ArrayList<Double> al2 = new ArrayList<Double>();
		al2.add(10.0);
		al2.add(20.0);
		al2.add(30.0);
		System.out.println("The sum is: " + add(al2));
	}
}
