package pkgAnnotation;

import java.lang.annotation.Annotation;

@Eclipse(workspace="E:/Abhishek/My resources", jdk=17.0f)
class Editor
{
	int wide, tall;
	String dimension;
	
	public Editor(int wide, int tall)
	{
		this.wide = wide;
		this.tall = tall;
		this.dimension = this.wide + " x " + this.tall + " pixels";
	}	
}

public class AnnotationDemo2
{
	public static void main(String[] args)
	{
		Editor e = new Editor(1920, 1080);
		System.out.println(e.wide);
		System.out.println(e.tall);
		System.out.println(e.dimension);
		
		@SuppressWarnings("rawtypes")
		Class c = e.getClass();
		@SuppressWarnings("unchecked")
		Annotation an = c.getAnnotation(Eclipse.class);
		Eclipse es = (Eclipse)an;
		System.out.println(es.workspace());
		System.out.println(es.jdk());
	}
}
