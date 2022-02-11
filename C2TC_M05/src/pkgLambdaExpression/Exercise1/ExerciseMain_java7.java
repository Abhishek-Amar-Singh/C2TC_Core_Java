package pkgLambdaExpression.Exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseMain_java7
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
		Collections.sort(people, new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		
		// Step 2: Create a method that prints all elements in a list
		System.out.println("Printing all people:");
		printAll(people);
		
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		
		// first way
		System.out.println("\nPrinting the first and last names of all the people whose last name begins with C:");
		printLastNameBeginningWithC(people);
		
		// second way
		System.out.println("\nPrinting all people whose last name begins with C:");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});
		
		System.out.println("\nPrinting all people whose first name begins with R:");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("R");
			}
			
		});
	}

	private static void printAll(List<Person> people)
	{
		for(Person p : people)
		{
			System.out.println(p);
		}
	}
	
	private static void printLastNameBeginningWithC(List<Person> people)
	{
		for(Person p : people)
		{
			if(p.getLastName().startsWith("C"))
			{
				System.out.println(p.getFirstName() + " " + p.getLastName());
			}
		}
	}
	
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
}

interface Condition
{
	boolean test(Person p);
}
