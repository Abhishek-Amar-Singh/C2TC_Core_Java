package pkgStream;

import java.util.Arrays;

public class ArrayOperations
{
	public static void main(String[] args)
	{
		int[] numbers = new int[] {4, 5, 6, 8, 7, 1, 3, 4, 3, 2, 9};
		
		//Sort Array
		Arrays.stream(numbers).sorted().forEach(System.out::print);
		
		System.out.println();
		
		//Remove duplicates
		Arrays.stream(numbers).distinct().forEach(System.out::print);
		
		//find max, min
		int max = Arrays.stream(numbers).max().getAsInt();
		int min = Arrays.stream(numbers).min().getAsInt();
		System.out.println("\nmax=" + max + " min=" + min);
		
		//find sum, average
		long sum = Arrays.stream(numbers).sum();
		double avg = Arrays.stream(numbers).average().getAsDouble();
		System.out.println("\nsum=" + sum + " average=" + avg);
		
		//filter whose value greater than 5 and square it
		Arrays.stream(numbers).filter(p -> p>5).map(p -> p*p).forEach(System.out::println);
	}
}
