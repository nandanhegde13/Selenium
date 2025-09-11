package Inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {

	
//	@BeforeMethod
//	public void runBefore()
//	{
//		System.out.println("Run First");
//	}
//
//	@AfterMethod
//	public void runAfter()
//	{
//		System.out.println("Run First");
//	}
	public void doThis()
	{
		System.out.println("I am here");
	}
	
	@Test
	public void test()
	{
		PS2 ps2 = new PS2(3);
		
	    System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
	}
}
