package pkgGenerics;

class GenericTest3
{
	public <E> void displayArrayElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.print(element + " ");
		}
		System.out.println();
	}
}

public class GenericDemo3
{
	public static void main(String[] args)
	{
		GenericTest3 gt = new GenericTest3();
		Integer[] iarr = {12, 9, 2, 84, 79};
		String[] sarr = {"C", "C++", "C#"};
		gt.displayArrayElements(iarr);
		gt.displayArrayElements(sarr);
	}
}
