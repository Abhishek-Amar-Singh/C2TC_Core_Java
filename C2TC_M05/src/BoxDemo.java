class Box
{
	float height, width, depth;
	String dimension;
	
	float calculateVol()
	{
		return this.height*this.width*this.depth;
	}
	
	String getDimension()
	{
		return "(Dimension = "+this.height+" x "+this.width+" x "+this.depth+")";
	}
}

public class BoxDemo
{
	public static void main(String[] args)
	{
		Box b = new Box();
		b.height = 7.15f;
		b.width = 10.8f;
		b.depth = 3.73f;
		System.out.println("Volume of Box"+b.getDimension()+" is "+b.calculateVol());
		
		Box b2 = new Box();
		b2.height = 22.345f;
		b2.width = 29.1884f;
		b2.depth = 19.47f;
		System.out.println("Volume of Box"+b2.getDimension()+" is "+b2.calculateVol());

	}

}