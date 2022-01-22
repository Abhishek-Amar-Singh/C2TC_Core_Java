import java.util.Scanner;

public class ScannerDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum is: "+(a+b));
		ScannerDemo sd = new ScannerDemo();
		System.out.println(sd.getClass());//class ScannerDemo
		System.out.println(sd.hashCode());//hashCode is a unique number that is assigned to the object
		System.out.println(sc.getClass());//class java.util.Scanner
		System.out.println(sc.hashCode());//hashCode is a unique number that is assigned to the object
	}
}