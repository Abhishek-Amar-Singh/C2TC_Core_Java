package pkgLambdaExpression;

public class ThisReferenceExample
{
	public void doProcess(int i, Process p)
	{
		p.process(i);
	}
	
	public void execute()
	{
		doProcess(10, i -> {
			System.out.println("value of i: " + i);
			System.out.println(this);
		});
	}
	
	public static void main(String[] args)
	{
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		
		//System.out.println(this);//Cannot use 'this' in a static context
		
		/*//1
		thisReferenceExample.doProcess(10, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println("value of i: " + i);
				System.out.println(this);
			}
			
			public String toString() {
				return "This is anonymous inner class";
			}
		});
		//Here, 'this' is an instance of anonymous inner class
		//The anonymous inner class just overrides the 'this' reference
		*/
		
		/*//2
		thisReferenceExample.doProcess(10, i -> {
			System.out.println("value of i: " + i);
			//System.out.println(this);//This will not work.
		});
		//Here, 'this' refers to the static context, that's why there is an error.
		//lambda doesn't overrides 'this' reference.
		*/
		
		thisReferenceExample.execute();
	}
	
	public String toString()
	{
		return "This is the main ThisReferenceExample class instance";
	}
}
