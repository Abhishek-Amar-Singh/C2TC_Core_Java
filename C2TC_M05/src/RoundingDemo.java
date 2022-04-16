
public class RoundingDemo
{
	public static void main(String[] args)
	{
		double d = 1.3;
		
		double floor = Math.floor(d);
		double ceil = Math.ceil(d);
		double round = Math.round(d);
		
		System.out.println(floor);//1.0
		System.out.println(ceil);//2.0
		System.out.println(round);//1.0
	}
}
