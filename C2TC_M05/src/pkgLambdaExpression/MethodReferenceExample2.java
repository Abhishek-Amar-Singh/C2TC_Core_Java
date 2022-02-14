package pkgLambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import pkgLambdaExpression.Exercise1.Person;
import java.util.function.Consumer;

public class MethodReferenceExample2
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
		
		
		// Step 2: Create a method that prints all elements in a list
		System.out.println("Printing all people:");
		printConditionally(people, p -> true, System.out::println); // System.out::println === p -> System.out.println(p)
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