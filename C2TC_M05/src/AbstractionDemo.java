abstract class Vehicle
{
	abstract void start();//abstract method
	void display()
	{
		System.out.println("Inside the abstract-class and created a simple method");
	}
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("Starts with key");
	}
}

class Scooter extends Vehicle
{
	void start()
	{
		System.out.println("Starts with kick");
	}
}
public class AbstractionDemo
{
	public static void main(String[] args)
	{
		//Vehicle v = new Vehicle(); Vehicle is abstract; cannot be instantiated
		Car c = new Car();
		c.start();

		Scooter s = new Scooter();
		s.start();

		c.display();
		s.display();
	}
}