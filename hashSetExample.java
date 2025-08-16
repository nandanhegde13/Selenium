package Default;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String args[])
	{
		HashSet<String> hs  = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("India");
		System.out.println(hs);
		
		Iterator<String> is = hs.iterator();
		while(is.hasNext())
		{
			System.out.println(is.next());
		}
	}
}
