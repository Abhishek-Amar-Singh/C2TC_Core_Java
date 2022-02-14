package pkgLambdaExpression;

import java.util.Arrays;
import java.util.List;

import pkgLambdaExpression.Exercise1.Person;

public class CollectionIterationExample
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
		
		System.out.println("Using for loop");
		for(int i=0; i<people.size(); i++)
		{
			System.out.println(people.get(i));
		}
		
		System.out.println("\nUsing for each loop");
		for(Person p : people)
		{
			System.out.println(p);
		}
		
		System.out.println("\nUsing lambda for each loop");
		people.forEach(p -> System.out.println(p));
		
		System.out.println("\nUsing lambda for each loop (with Method Reference)");
		people.forEach(System.out::println);
	}
}
