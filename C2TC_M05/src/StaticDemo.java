class XStaticDemo
{
	static
	{
		System.out.println("Hi I am in static block in XStaticDemo-class");
	}
}

public class StaticDemo
{
	static int a = 10;
	static int b;
	static int c=25;
	
	static void func1()
	{
		System.out.println("a value is " + a);
		System.out.println("b value is " + b);
		System.out.println("c value is " + c);
	}
	
	static void func2()
	{
		int d= 23;
		System.out.println("d value is "+ d);
		System.out.println("c value is "+ c);
	}
	
	static
	{
		System.out.println("Hi I am in static block no.1 in StaticDemo-class");
		// System.exit(0);
	}

	public static void main(String[] args)
	{
		System.out.println("c Value is: " +StaticDemo.c);
		StaticDemo.func1();
		StaticDemo.func2();
		
		new XStaticDemo();
	}
	
	static
	{
		System.out.println("Hi I am in static block no.2 in StaticDemo-class");
	}

}