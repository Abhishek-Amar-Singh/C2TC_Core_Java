package pkgStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3
{
	public static void main(String[] args)
	{
		Employee e3 = new Employee(103, "Johny", "Senior Manager", 60000);
		Employee e4 = new Employee(104, "Robert", "Associate", 70000);
		Employee e5 = new Employee(105, "Michael", "Sr Associate", 40000);
		
		List<Employee> alist=new ArrayList<Employee>();
		alist.add(new Employee(101, "John", "Manager", 50000));
		alist.add(new Employee(102, "Smith", "Lead", 60000));
		alist.add(e3);
		alist.add(e4);
		alist.add(e5);
		
		Stream<Employee> parallelStream = alist.parallelStream();
		System.out.println("Using stream as parallelStream():");
		parallelStream.forEach(System.out::println);
		
		Stream<Employee> stream = alist.stream();
		System.out.println("\nUsing stream as stream():");
		stream.forEach(System.out::println);
	}
}
