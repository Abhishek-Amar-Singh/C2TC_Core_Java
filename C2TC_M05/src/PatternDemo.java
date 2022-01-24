public class PatternDemo
{
	static void rightAngledTrianglePattern1(int rows)
	{
		for(int i=1; i<rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}
	
	static void rightAngledTrianglePattern2(int rows)
	{
		for(int i=1; i<rows; i++)
		{
			for(int j=i; j<rows-1; j++)
			{
				System.out.print(" ");
			}
			System.out.println("@".repeat(i));
		}
	}
	
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("Pattern 1:");
		PatternDemo.rightAngledTrianglePattern1(rows);
		System.out.println("Pattern 2:");
		PatternDemo.rightAngledTrianglePattern2(rows);
	}
}
