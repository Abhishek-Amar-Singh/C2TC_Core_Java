class ClassB
{
	static void showPrint()
	{
		System.out.println("static-method inside ClassB");
	}
}

interface InterfaceB
{
	static void displayPrint()
	{
		System.out.println("static-method inside InterfaceB");
	}
}

public class ClassInterfaceDemo extends ClassB implements InterfaceB
{
	public static void main(String[] args)
	{
		ClassInterfaceDemo cid = new ClassInterfaceDemo();
		
		//how many ways through which we can access static-method of ClassB? -> 3
		cid.showPrint();
		ClassInterfaceDemo.showPrint();
		ClassB.showPrint();
		
		//how many ways through which we can access static-method of InterfaceB? -> 1
		InterfaceB.displayPrint();
	}
}