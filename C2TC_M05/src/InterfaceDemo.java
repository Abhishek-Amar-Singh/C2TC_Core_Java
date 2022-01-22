interface i1
{
	void setFunc(int x, int y);//by-default this is 'public abstract void setFunc();'
	default void display()
	{
		System.out.println("simple-concrete-method inside the interface i1");
	}
	static void showPrint()
	{
		System.out.println("static-method inside the interface i1");
	}
}

interface i2
{
	void displayFunc();
}

class ClassA implements i1,i2
{
	int p=10;
	int q=20;
	
	public void setFunc(int x, int y) 
	{
		p = x;
		q = y;
	}
	
	public void incrementFunc()
	{
		p += 1;
		q += 1;
	}
	
	public void displayFunc()
	{
		System.out.println("value of p is " + p);
		System.out.println("value of q is " + q);
	}
}

public class InterfaceDemo
{
	public static void main(String[] args)
	{
		ClassA c = new ClassA();
		System.out.println(c.p+", "+c.q);
		c.setFunc(72, 116);
		c.displayFunc();
		System.out.println(c.p+", "+c.q);
		c.incrementFunc();
		c.displayFunc();
		System.out.println(c.p+", "+c.q);
		
		c.display();
		i1.showPrint();//here if you try 'c.showPrint();' then it will display an error since static-methods belongs to class not object. In this case, static-method belongs to interface.
	}
}