package pkgGenerics;

class GenericTest2<T>
{
	T obj;
	
	void add(T obj)
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
		GenericTest2<Integer> gt = new GenericTest2<Integer>();
		gt.add(14);
		System.out.println(gt.get());
	}
}
