package pkgLambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import pkgLambdaExpression.Exercise1.Person;

public class StreamsExample
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
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		/*
		 * Streams:
		 * A sequence of elements supporting sequential and parallel aggregate operations.
		*/
		
		Stream<Person> stream = people.stream();
		stream.filter(p -> p.getAge() > 25)
		.forEach(p -> System.out.println(p.getFirstName()));
		
		long count = people.stream()
		.filter(p -> p.getLastName().startsWith("S"))
		.count();
		System.out.println(count);
		
		long count2 = people.parallelStream()
		.filter(p -> p.getLastName().startsWith("S"))
		.count();
		System.out.println(count2);
	}
}