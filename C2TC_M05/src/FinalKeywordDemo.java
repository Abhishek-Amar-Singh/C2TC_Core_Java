class Car1
{
	final int max_speed = 120;
	void controlSpeed()
	{
		//max_speed=180;//This will generate an error..you can't change value of final stated variables.
		System.out.println("Maximum speed value is " +max_speed);
	}
}
public class FinalKeywordDemo
{
	public static void main(String[] args)
	{
		Car1 c1=new Car1();
		c1.controlSpeed();
	}
}