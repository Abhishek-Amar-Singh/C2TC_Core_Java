package pkgLambdaExpression.Greetings;

public class Greeter
{
	public void greet(Greeting greeting)
	{
		greeting.perform();
	}
	
	public static void main(String[] args)
	{
		Greeter greeter = new Greeter();
		HelloWorldGreeting hwg = new HelloWorldGreeting();
		greeter.greet(hwg);
		
		hwg.perform();
		
		Greeting lambdaGreeting = () -> System.out.println("Namaskar");
		lambdaGreeting.perform();
		
		Greeting innerClassGreeting = new Greeting() {
			@Override
			public void perform()
			{
				System.out.println("Namaskaram");
			}
		};
		innerClassGreeting.perform();
		
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		greeter.greet(() -> System.out.println("Namaste!"));
	}
}
