package pkgAnnotation;

import java.lang.annotation.Annotation;

//@SmartPhone()
@SmartPhone(os="Android", version=9)
class NokiaSeries
{
	String model;
	int screenSize;
	
	public NokiaSeries(String model, int screenSize)
	{
		this.model = model;
		this.screenSize = screenSize;
	}
	
}
public class AnnotationDemo
{

	public static void main(String[] args)
	{
		NokiaSeries ns = new NokiaSeries("Fire", 4);
		System.out.println(ns.model);
		System.out.println(ns.screenSize);
		Class c = ns.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone sp = (SmartPhone)an;
		System.out.println(sp.os());
		System.out.println(sp.version());
	}

}

//Annotation -> is a metadata