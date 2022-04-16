public class StringsDemo
{	
	public static void main(String[] args)
	{
		System.out.println('h' + 'e' + 'y' + '!'); // 359
		
		String s1 = new String("Hello World!");
		String s2 = new String("Hello WorLd!");
		boolean b = s1.equals(s2) == s2.equals(s1);
		System.out.println(b); // true
		
		String str1 = "Java Strings";
		String str2 = "Java Strings";
		System.out.println(str1 == str2); // true
		System.out.println(str1.equals(str2)); // true
	}
}