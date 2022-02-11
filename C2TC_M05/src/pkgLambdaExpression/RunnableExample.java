package pkgLambdaExpression;

public class RunnableExample
{
	public static void main(String[] args)
	{
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("printed inside Runnable");
			}
		});
		myThread.run();
		
		Thread myLambdaThread = new Thread(() -> System.out.println("printed inside Lambda Runnable"));
		myLambdaThread.run();
	}
}
