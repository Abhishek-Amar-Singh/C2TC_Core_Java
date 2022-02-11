package pkgLambdaExpression.Exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ExerciseMain_java8_codeOptimize1
{
	public static void main(String[] args)
	{
		List<Person> people = Arrays.asList(
				new Person("Ram", "Charan", 31),
				new Person("Shruti", "Singh", 21),
				new Person("Dimple", "Purohit", 30),
				new Person("Raksha", "Shetty", 17),
				new Person("Ramesh", "Chaurasia", 23),
				new Person("Mohan", "Chaudhary", 34)
				);
		
		
		// Step 1: Sort list by last name
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		/*
		 * Comparator-interface has single abstract-method i.e., int compareTo(T o1, T o2);
		 * So, interface with a single abstract-method is known as functional interface
		 * Here, we can use lambda expression
		 */
		
		
		// Step 2: Create a method that prints all elements in a list
		System.out.println("Printing all people:");
		printConditionally(people, p -> true);
		
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("\nPrinting all people whose last name begins with C:");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		System.out.println("\nPrinting all people whose first name begins with R:");
		printConditionally(people, p -> p.getFirstName().startsWith("R"));
	}
	
	/*
	private static void printConditionally(List<Person> people, Condition condition)
	{
		for(Person p : people)
		{
			if(condition.test(p))
			{
				System.out.println(p);
			}
		}
	}
	*/
	
	/*
	 * Instead of creating a Condition-interface we can use Predicate-interface
	 * which is an in-built and we can get that from 'import java.util.function.Predicate'.
	 * Both Condition and Predicate interfaces does the same thing.
	 * Condition-interface: @param p the input argument
     * 						@return {@code true} if the input argument matches the condition,
     * 						otherwise {@code false}
	 * Predicate-interface: @param t the input argument
     * 						@return {@code true} if the input argument matches the predicate,
     * 						otherwise {@code false}
     * Note: we can use 'import java.util.function' to get the right functional-interface for
     * 		 the required lambda-expression so that we don't need to create interfaces to perform
     * 		 lambda-expressions.
	 */
	private static void printConditionally(List<Person> people, Predicate<Person> predicate)
	{
		for(Person p : people)
		{
			if(predicate.test(p))
			{
				System.out.println(p);
			}
		}
	}
}
