package pkgStream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo2p1
{
	public static void main(String[] args)
	{
		List<MobilePhone> alist = new ArrayList<MobilePhone>();
		alist.add(new MobilePhone(1, "Samsung", 15999f));
		alist.add(new MobilePhone(2, "Nokia", 10499f));
		alist.add(new MobilePhone(3, "BlackBerry", 13999f));
		alist.add(new MobilePhone(4, "IPhone", 59999f));
		alist.add(new MobilePhone(5, "Vivo", 34999f));
		alist.add(new MobilePhone(6, "Oppo", 18000f));
		
		List<Float> blist = new ArrayList<Float>();
		for(MobilePhone mobile : alist)
		{
			if(mobile.price < 30000)
			{
				blist.add(mobile.price);
			}
		}
		System.out.println(blist);
	}
}