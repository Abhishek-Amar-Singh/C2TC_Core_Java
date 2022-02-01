public class ArgsDemo
{	
	public static void main(String[] args)
	{
		System.out.println(args.toString());
		if(args.length==0)
		{
			System.out.println("length of args[] is 0.");
		}
		else
		{
			for(String i:args)
			{
				System.out.println(i);
			}
		}
		
		//ArgsDemo.main(new String[] {"C++","C#","Java"});
	}
}
