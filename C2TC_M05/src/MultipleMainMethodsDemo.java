public class MultipleMainMethodsDemo
{
	public static void main()
	{
		System.out.println("second main-method()");
	}
	
	public static void main(int num)
	{
		System.out.println("third main-method("+num+")");
	}
	
	String main(String str, int count)
	{
		return str.repeat(count);
	}
	
	void main(String[] str, int[] arr)
	{
		System.out.println(str.hashCode()+", "+arr.hashCode());
	}
	
	public static void main(String[] args)
	{
		System.out.println("main-method(String[] args)");
		
		MultipleMainMethodsDemo.main();
		
		MultipleMainMethodsDemo.main(16);
		
		MultipleMainMethodsDemo mmmd = new MultipleMainMethodsDemo();
		String s = mmmd.main("*", 10);
		System.out.println(s);
		
		mmmd.main(new String[]{"Doraemon", "Nobita"}, new int[]{1, 2, 'z'});
	}
}
