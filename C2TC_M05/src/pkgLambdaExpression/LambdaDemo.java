package pkgLambdaExpression;

@FunctionalInterface
interface MyLambda1
{
	int div(int x, int y);
	
	default void m1()
	{
		System.out.println("Inside m1() of interface MyLambda1");
	}
}

@FunctionalInterface
interface MyLambda2
{
	void str();
}

public class LambdaDemo
{
	public static void main(String[] args)
	{
		MyLambda1 safeDivideFunction = (int a, int b) -> {
			if(b == 0) return 0;
			return a / b;
		};
		System.out.println(safeDivideFunction.div(28, 14));
		safeDivideFunction.m1();
		
		MyLambda2 greeting = () -> System.out.println("Namaste");
		greeting.str();
	}
}
