package pkgLambdaExpression.Exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class ExerciseMain_java8_codeOptimize2
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
		
		
		// Step 2: Create a method that prints all elements in a list
		System.out.println("Printing all people:");
		printConditionally(people, p -> true, p -> System.out.println(p));
		
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("\nPrinting all people whose last name begins with C:");
		printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
		
		System.out.println("\nPrinting all people whose first name begins with R:");
		printConditionally(people, p -> p.getFirstName().startsWith("R"), p -> System.out.println(p.getFirstName()));
	}
	
	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer)
	{
		for(Person p : people)
		{
			if(predicate.test(p))
			{
				consumer.accept(p);
			}
		}
	}
}
