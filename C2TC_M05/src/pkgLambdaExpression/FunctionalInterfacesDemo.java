package pkgLambdaExpression;
/*
 * From Java, you might know Functional Interfaces,
 * i.e. interfaces with just a single abstract method (SAM).
 */
interface ArithmeticOperation
{
	int operation(int x, int y);
}

class Plus implements ArithmeticOperation
{
	@Override
	public int operation(int x, int y)
	{
		return x + y;
	}
		
}

public class FunctionalInterfacesDemo
{
	public static void main(String[] args)
	{
		ArithmeticOperation minus = new ArithmeticOperation()
		{
			@Override
			public int operation(int x, int y)
			{
				return x - y;
			}
		};
		
		//Since Java 8 we can use lambda
		ArithmeticOperation times = (x, y) -> x * y;
		
		System.out.println(new Plus().operation(13, 3));//16
		System.out.println(minus.operation(13, 3));//10
		System.out.println(times.operation(13, 3));//39
	}
}