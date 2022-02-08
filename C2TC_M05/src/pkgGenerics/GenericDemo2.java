package pkgGenerics;

class GenericTest2<T>
{
	T obj;
	
	void set(T obj)
	{
		this.obj = obj;
	}
	
	T get()
	{
		return obj;
	}
}

public class GenericDemo2
{
	public static void main(String[] args)
	{
		GenericTest2<Integer> gt2 = new GenericTest2<Integer>();
		gt2.set(14);
		System.out.println(gt2.get());
	}
}
