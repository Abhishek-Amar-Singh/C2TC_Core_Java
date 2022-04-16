package pkgStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1
{
	public static void main(String[] args)
	{
		Integer[] nums = new Integer[] {131, 55, 189, 202};
		System.out.println("Array elements:");
		Stream<Integer> stream1 = Arrays.stream(nums);
		stream1.forEach(System.out::println);
		
		List<String> alist = new ArrayList<String>();
		alist.add("C");
		alist.add("C++");
		alist.add("C#");
		System.out.println("List elements:");
		Stream<String> stream2 = alist.stream();
		stream2.forEach(System.out::println);
		
		Stream<Character> stream3 = Stream.of('z', 'Y', 'm', 'k');
		System.out.println("Stream elements:");
		stream3.forEach(System.out::println);
	}
}
