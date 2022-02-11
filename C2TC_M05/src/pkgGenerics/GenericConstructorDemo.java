package pkgGenerics;

public class GenericConstructorDemo
{
	private double v;
	
	public <T extends Number>GenericConstructorDemo(T t)
	{
		v = t.doubleValue();
	}

	void show()
	{
		System.out.println("value of v is: " + v);
	}
	
	public static void main(String[] args)
	{
		  System.out.println("Number to Double Conversion:");
		  GenericConstructorDemo gcd1 = new GenericConstructorDemo(10);
		  gcd1.show();
		  
		  GenericConstructorDemo gcd2 = new GenericConstructorDemo(136.8F);
		  gcd2.show();
	}
}
