package pkgLambdaExpression;

public class ClosureExample
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		doProcess(a, i -> {
			i += 5;
			System.out.println(i + b);
			/*
			 * When lambda expression accesses the value of b then that variable becomes final.
			 * This is the concept of closure.
			 * b value is frozen.
			 * Wherever lambda expression goes, the frozen value of b goes along with it.
			 * Don't change the value of b because when you do change then compiler is telling us
			 * that variable b is effectively final.
			 */
		});
	}
	
	private static void doProcess(int i, Process p)
	{
		p.process(i);
	}
}

interface Process
{
	void process(int i);
}