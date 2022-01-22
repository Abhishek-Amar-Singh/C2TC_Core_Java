package pkgCollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

class Student2
{
	int id;
	String name;
	int grade;
	
	public Student2(int id, String name, int grade)
	{
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public String toString()
	{
		String str="Student is ["+id+","+name+","+grade+"]";
		return str;
	}
}

public class VectorDemo
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		Student2 s1 = new Student2(131, "Harry", 10);
		Student2 s2 = new Student2(138, "Potter", 10);
		v.addElement(s2);
		v.addElement(s1);
		v.addElement("1933");
		v.addElement(new String("1944"));
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			Object o = e.nextElement();
			System.out.println(o);
		}

	}

}